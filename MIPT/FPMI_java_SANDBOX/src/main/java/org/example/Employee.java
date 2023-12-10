package org.example;

public class Employee {
    Name name;
    Department dept;
    Employee(Name name, Department dept){
        this.name = name;
        this.dept = dept;
    }

    public String toString(){
        String res;
        if (this.dept.boss == this){
            res = this.name + " начальник отдела " + this.dept.name;
        }else {
            res = this.name + " работает в отделе" + this.dept.name + ", начальник которого " + this.dept.boss.name + ", ";
        }
        res = res + this.dept;
        return res;
    }


}
