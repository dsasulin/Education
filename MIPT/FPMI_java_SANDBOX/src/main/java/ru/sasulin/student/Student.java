package ru.sasulin.student;

import ru.sasulin.compare.Compareble;

import java.util.ArrayList;
import java.util.Stack;

public class Student implements Compareble {

    private String name;

    private ArrayList<Integer> rates = new ArrayList<Integer>();

    private Stack<Student> history = new Stack<>();

    public Student(String name){
        this(name,new ArrayList<Integer>());
    }
    public Student(String name, ArrayList<Integer> rates){
        for(int i = 0; i < rates.size(); i++){
            if (rates.get(i) < 2 || rates.get(i) > 5){
                throw new IllegalArgumentException("Оценка не может быть меньше 2 и больше 5");
            }
        }
        this.name = name;
        this.rates = rates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        history.push(new Student(this.name, (ArrayList<Integer>) this.rates.clone()));
        this.name = name;
    }

    public void setRates(ArrayList<Integer> rates) {
        this.rates = rates;
    }

    public ArrayList<Integer> getRates() {
        return (ArrayList<Integer>) rates.clone();
    }

    public void addGrade(int grade){
        if (grade < 2 || grade > 5){
            throw new IllegalArgumentException("Оценка не может быть меньше 2 и больше 5");
        }
        history.push(new Student(this.name, (ArrayList<Integer>) this.rates.clone()));
        this.rates.add(grade);
    };
    

    public void removeGrade(int index){
        history.push(new Student(this.name, (ArrayList<Integer>) this.rates.clone()));
        this.rates.remove(index);
    };

    public void undo(){
        Student tmp;
        tmp = this.history.pop();
        this.name = tmp.name;
        this.rates = tmp.rates;
    };

    public Save getSave(){
        Save save = new Save("");
        Student tmp = history.peek();
        save.name = tmp.name;
        save.rates = tmp.rates;
        return save;
    };

    public int avg(){
        int res = 0;
        if (this.rates.size() == 0) {
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
        if (this.rates.size() > 0) {
                res = true;
                for (int i = 0; i < this.rates.size(); i++){
                    if (this.rates.get(i) != 5){
                        res = false;
                    }
                }
        };
        return res;
    }
    public String toString() {
        String res;
        res = this.name + ": ";
        int i = 0;
        for (i = 0; i < this.rates.size(); i++) {
            if (i == 0) {
                res = res + this.rates.get(i);
            }else {
                res = res + "," + this.rates.get(i);
            }
        }
        res = res + ", средний бал: " + this.avg() + ", Отличник: " + this.isFive();
        return res ;
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

}
