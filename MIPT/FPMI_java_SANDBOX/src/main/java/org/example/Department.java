package org.example;

import java.util.ArrayList;

public class Department {
    String name;
    private Employee boss = new Employee(new Name("N/A"), this);
    private ArrayList<Employee> staff = new ArrayList<Employee>();
    public Employee getBoss() {
        return boss;
    }

    public void setBoss(Employee boss) {
        this.boss = boss;
        this.staff.add(boss);
    }

    public ArrayList<Employee> getStaff() {
        return staff;
    }

    public void setStaff(ArrayList<Employee> staff) {
        this.staff = staff;
    }


    Department(String name){
        this.name = name;
    }
    Department(String name, Employee boss){
        this.name = name;
        this.boss = boss;
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
