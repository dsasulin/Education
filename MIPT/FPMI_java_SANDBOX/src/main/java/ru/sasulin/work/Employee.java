package ru.sasulin.work;

import ru.sasulin.human.Name;

public class Employee {
    Name name;
    private Department dept;
    public Employee(Name name, Department dept){
        this.name = name;
        this.dept = dept;
        this.dept.addStaff(this);
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        if(this.dept.getBoss() == this) {
            this.dept.setBoss(new Employee(new Name("N/A"), this.dept));
        }
//        if (this.getDept() != dept && this.getDept() != null ) {
//            this.dept.removeStaff(this);
//        }
        this.dept = dept;
        this.getDept().staff.add(this);
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
