package ru.sasulin.work;

import lombok.Getter;
import lombok.Setter;
import ru.sasulin.human.Name;

public class Employee {
    @Getter
    @Setter
    private Name name;
    @Getter
    Department dept;
    public Employee(Name name){
        this.name = name;
    }


    public void setDept(Department dept) {
        if (dept == null && this.dept == null) return;
        if (dept == null && this.dept != null)  {
            this.dept.removeStaff(this);
            dept = null;
            return;
        };
        dept.addStaff(this);
    }

    public String toString(){
        String res;
        if (this.dept.getBoss() == this){
            res = this.name + " начальник отдела " + this.dept.name;
        }else {
            res = this.name + " работает в отделе " + this.dept.name + ", начальник которого " + this.dept.getBoss().name + ", ";
        }
        res = res + this.dept;
        return res;
    }


}
