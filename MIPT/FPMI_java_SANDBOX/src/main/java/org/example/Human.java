package org.example;

public class Human {
    Name name;
    int height;
    Human father;
    char gender;

    Human(Name name){
        this.name = name;
    }
    Human(Name name, char gender){
        this.name = name;
        this.gender = gender;
    }
    Human(Name name, int height){
        this.name = name;
        this.height = height;
    }
    Human(String name, int height){
        this(new Name(name), height);


    }
    Human(String name, int height, Human father){
        this.name.name = name;
        this.height = height;
        this.name.secondName = father.name.secondName;
        if (this.name.middleName == null && this.father !=null) {
            if (this.gender == 'м') {
                this.name.middleName = this.father.name.name + "ович";
            }
            if (this.gender == 'ж' && this.father != null) {
                this.name.middleName = this.father.name.name + "овна";
            }
        }

    }
    Human(Name name, int height,char gender){
        this.name = name;
        this.height = height;
        this.gender = gender;
    }
    Human(Name name, int height, Human father){
        this.name = name;
        this.height = height;
        this.father = father;
    }
    Human(Name name, int height, Human father, char gender){
        this.name = name;
        this.height = height;
        this.father = father;
        this.gender = gender;
    }

    public String toString(){
        if (this.name.secondName == null && this.father != null) {
            this.name.secondName = this.father.name.secondName;
        }
        if (this.name.middleName == null && this.father !=null) {
            if (this.gender == 'м') {
                this.name.middleName = this.father.name.name + "ович";
            }
            if (this.gender == 'ж' && this.father != null) {
                this.name.middleName = this.father.name.name + "овна";
            }
        }
        String s1 = this.name +  ", рост: " + this.height;
        return s1;
    }

}
