package org.example;

public class Name {
    String name;
    String secondName;
    String middleName;

    Name(String name, String secondName, String middleName ){
        this.secondName = secondName;
        this.name = name;
        this.middleName = middleName;
    }
    Name(String name, String secondName){
        this.secondName = secondName;
        this.name = name;
    }
    Name(String name){
        this.name = name;
    }

    public String toString(){
        String s1;
        if (secondName == null && middleName == null){
            s1 = this.name;
            return s1;
        }
        if (middleName == null){
            s1 = this.secondName + " " + this.name;
            return s1;
        }
        s1 = this.secondName + " " + this.name + " " + middleName;
        return s1;
    }
}
