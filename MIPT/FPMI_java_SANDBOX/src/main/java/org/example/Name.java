package org.example;

public class Name {
    private String name;
    private String secondName;
    private String middleName;

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    Name(String name, String secondName, String middleName ){
        if (name.trim().length() < 1 ){
            throw new IllegalArgumentException("Имя не может быть пустым");
        }
//        if (secondName.trim().length() < 1 ){
//            throw new IllegalArgumentException("Имя не может быть пустым");
//        }
//        if (middleName.trim().length() < 1 ){
//            throw new IllegalArgumentException("Имя не может быть пустым");
//        }
        this.secondName = secondName;
        this.name = name;
        this.middleName = middleName;
    }
    Name(String name, String secondName){
        this(name, secondName,null);
    }
    Name(String name){
        this(name,null,null);
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
