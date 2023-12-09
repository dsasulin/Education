package org.example;

import java.util.ArrayList;

public class Department {
    String name;
    Employee boss;

    ArrayList<Employee> staff = new ArrayList<Employee>();

    Department(String name){
        this.name = name;
    }
    Department(String name, Employee boss){
        this.name = name;
        this.boss = boss;
    }

    public String toString(){
        String res;
        res = "Сотрудники отдела" + this.name + ": ";
        for (int i = 0; i < this.staff.size(); i++ ){
            res = res + this.staff.get(i).name + " ";
        }
        return res;
    }


}
