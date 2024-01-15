package ru.sasulin.work;

import lombok.Getter;
import lombok.Setter;
import ru.sasulin.human.Name;

import java.util.ArrayList;
import java.util.List;

public class Department {
    @Getter @Setter
    String name;
    @Getter
    Employee boss;
    ArrayList<Employee> staff = new ArrayList();

    public Department(String name){

        this.name = name;
    }
    public void setBoss(Employee boss) {
        addStaff(boss);
        this.boss = boss;
    }

    public List<Employee> getStaff() {
        return new ArrayList<>(staff);
    }


    public void setStaff(ArrayList<Employee> staff) {
        for(Employee employee : staff){
            this.addStaff(employee);
        }
    }

    public void addStaff(Employee employee) {
        if (employee == null ) return;
        if (employee.getDept() == this) return;
        if (employee.getDept() != null) employee.getDept().removeStaff(employee);
        employee.setDept(this);
        staff.add(employee);
    }

    public void removeStaff(Employee employee) {
        if (employee == null ) return;
        if (!staff.contains(employee)) return;
        if (employee == boss) boss = null;
        staff.remove(employee);
        employee.setDept(null);
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
