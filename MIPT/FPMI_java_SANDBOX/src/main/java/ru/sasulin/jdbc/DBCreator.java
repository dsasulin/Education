package ru.sasulin.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBCreator {
    public static void createDB() {
        try (Connection con = DriverManager.getConnection("jdbc:h2:.\\Office")) {
            Statement stm = con.createStatement();
            stm.executeUpdate("DROP TABLE Department IF EXISTS");
            stm.executeUpdate("CREATE TABLE Department (ID INT PRIMARY KEY, NAME VARCHAR(255))");
            stm.executeUpdate("INSERT INTO Department VALUES(1, 'Accounting')");
            stm.executeUpdate("INSERT INTO Department VALUES(2, 'IT')");
            stm.executeUpdate("INSERT INTO Department VALUES(3, 'HR')");

            stm.executeUpdate("DROP TABLE Employee IF EXISTS");
            stm.executeUpdate("CREATE TABLE Employee (ID INT PRIMARY KEY, NAME VARCHAR(255), DepartmentID INT)");
            stm.executeUpdate("INSERT INTO Employee VALUES(1, 'Ivan', 1)");
            stm.executeUpdate("INSERT INTO Employee VALUES(2, 'Anna', 1)");

            stm.executeUpdate("INSERT INTO Employee VALUES(3, 'Masha', 2)");
            stm.executeUpdate("INSERT INTO Employee VALUES(4, 'Vaisa', 2)");

            stm.executeUpdate("INSERT INTO Employee VALUES(5, 'Petya', 3)");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
