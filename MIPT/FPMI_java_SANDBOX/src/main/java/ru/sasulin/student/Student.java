package ru.sasulin.student;

import lombok.Getter;
import lombok.Setter;
import ru.sasulin.compare.Compareble;

import java.util.*;
import java.util.function.Predicate;

public class Student implements Compareble, Action {

    private Predicate<Integer> predicate;
    @Getter
    private String name;

    private ArrayList<Integer> rates = new ArrayList<Integer>();

    private final Deque<Action> actions = new ArrayDeque<>();

    Student(String name) {
        this.name = name;
    }
    public Student(String name, Predicate<Integer> rule, int... marks) {
        this(name);
        this.predicate = rule;
        for (int i : marks) {
            if (predicate.test(i)) {
                this.rates.add(i);
            }
        }
    }

    public void setName(String name) {
        String tmp = this.name;
        actions.push(()->this.name=tmp);
        this.name = name;
    }

    public ArrayList<Integer> getRates() {
        return (ArrayList<Integer>) rates.clone();
    }

    public void addGrade(int grade){
        if (grade < 2 || grade > 5){
            throw new IllegalArgumentException("Оценка не может быть меньше 2 и больше 5");
        }
        actions.push(()->rates.remove((Object)grade));
        this.rates.add(grade);
    };


    public void removeGrade(int index){
        int grade = rates.get(index);
        actions.push(()->rates.add(index,grade));
        this.rates.remove(index);
    };

    public void undo(){
        actions.pop().make();
    };

    public Save getSave(){
        return new SaveImpl();
    };

    public int avg(){
        int res = 0;
        if (this.rates.isEmpty()) {
            return res;
        }else{
            for(int i = 0; i < this.rates.size(); i++){
                res = res + this.rates.get(i);
            }
        }
        res = res / this.rates.size();
        return res;
    }

    public boolean isFive(){
        boolean res = false;
        if (!this.rates.isEmpty()) {
                res = true;
            for (Integer rate : this.rates) {
                if (rate != 5) {
                    res = false;
                }
            }
        };
        return res;
    }
    public String toString() {
        StringBuilder res;
        res = new StringBuilder(this.name + ": ");
        int i = 0;
        for (i = 0; i < this.rates.size(); i++) {
            if (i == 0) {
                res.append(this.rates.get(i));
            }else {
                res.append(",").append(this.rates.get(i));
            }
        }
        res.append(", средний бал: ").append(this.avg()).append(", Отличник: ").append(this.isFive());
        return res.toString();
    }

    @Override
    public int compare(Object obj) {
        Student student2 = (Student) obj;
        int res = 0;
        if (this.avg() > student2.avg()) res =  1;
        if (this.avg() == student2.avg()) res =  0;
        if (this.avg() < student2.avg()) res =  -1;
        return res;

    }
    private class SaveImpl implements Save{
        String name = Student.this.name;
        List<Integer> rates = new ArrayList<>(Student.this.rates);

        @Override
        public void load() {
            Student.this.name = name;
            Student.this.rates.clear();
            Student.this.rates.addAll(rates);
        }
    }
    @Override
    public void make() {

    }
}
