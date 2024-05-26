package ru.sasulin.jdbc;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;


@Setter
@Getter
@ToString
@Entity
@Table(name = "department")
public class Department {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "department"/*, cascade = CascadeType.ALL, fetch = FetchType.EAGER*/)
    private List<Employee> staff;

    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Department() {
    }

    public void addEmployee(Employee employee) {
        staff.add(employee);
        employee.setDepartment(this);
    }

    public void removeEmployee(Employee employee) {
        staff.remove(employee);
        employee.setDepartment(null);
    }

}
