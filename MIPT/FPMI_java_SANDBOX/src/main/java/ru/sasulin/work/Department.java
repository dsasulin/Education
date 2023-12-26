package ru.sasulin.work;

import ru.sasulin.human.Name;

import java.util.ArrayList;

public class Department {
    String name;
    private Employee boss = new Employee(new Name("N/A"), this);
    public ArrayList<Employee> staff = new ArrayList();

    public Employee getBoss() {
        return boss;
    }

    public void setBoss(Employee boss) {
        // если начальник в другом отделе переходит на начальника в этот отдел
        // убираем его из начальников старого отдела.
        if (boss.getDept().getBoss() == boss) {
            boss.getDept().setBoss(new Employee(new Name("N/A"), boss.getDept()));
        }
        this.boss = boss;
        // если босс из другого отдела убираем его из списка сотрудников старого отдела
        // и добавляем в новый.
        if (boss.getDept() != this) {
            boss.getDept().removeStaff(boss);
            this.addStaff(boss);
        }
    }

    public ArrayList<Employee> getStaff() {
        return staff;
    }

    public Department(String name){

        this.name = name;
    }



    public void setStaff(ArrayList<Employee> staff) {
        for(Employee employee : staff){
            this.addStaff(employee);
        }
    }

    public void addStaff(Employee employee) {
        if(employee.getDept() != this ){
            employee.getDept().removeStaff(employee);
        }
        if(this.staff == null) {
            this.staff = new ArrayList<>();
        }
       this.staff.add(employee);
        employee.setDept(this);
    }

    public void removeStaff(Employee employee) {
        int i;
        i = this.staff.indexOf(employee);
        if (i > -1 ) {
            this.staff.remove(i);
        }
    }


    public String toString(){
        String res;
        res = "Сотрудники отдела " + this.name + ": ";
        for (int i = 0; i < this.staff.size(); i++ ){
            res = res + this.staff.get(i).name + " ";
        }
        return res;
    }


}
