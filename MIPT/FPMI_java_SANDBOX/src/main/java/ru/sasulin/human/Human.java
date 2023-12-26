package ru.sasulin.human;

public class Human {
    Name name;
    int height;
    private final Human father;
    char gender;

    public Human getFather() {
        return father;
    }

    public Name getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height < 0 || height > 500 ) {
            throw new IllegalArgumentException("Рост не может быть отрицательным и больше 500");
        }
        this.height = height;
    }

    Human(Name name){
        this(name, 0,null, ' ');
    }
    Human(Name name, char gender){
       this(name, 0,null,gender);
    }
    public Human(Name name, int height){
        this(name, height,null, ' ');
    }
    Human(String name, int height){
        this(new Name(name), height, null, ' ');
    }
    Human(String name, int height, Human father){
        this(new Name(name),
                height,
                father,
                ' ');
    }

    Human(Name name, int height, char gender){
        this(name, height, null, gender);
    }
    public Human(Name name, int height, Human father){
        this(name, height, father, ' ');
    }
    Human(Name name, int height, Human father, char gender){
        if(name.getSecondName() == null && father !=null){
            name.setSecondName(father.name.getSecondName());
        }
        if (name.getMiddleName() == null && father !=null) {
            if (gender == 'м') {
                name.setMiddleName(father.name.getName() + "ович") ;
            }
            if (gender == 'ж' && father != null) {
                name.setMiddleName(father.name.getName() + "овна");
            }
        }
        if (height < 0 || height > 500 ) {
            throw new IllegalArgumentException("Рост не может быть отрицательным и больше 500");
        }
        this.name = name;
        this.height = height;
        this.father = father;
        this.gender = gender;
    }

    public String toString(){
        if (this.name.getSecondName() == null && this.father != null) {
            this.name.setSecondName(this.father.name.getSecondName());
        }
        if (this.name.getMiddleName() == null && this.father !=null) {
            if (this.gender == 'м') {
                this.name.setMiddleName(this.father.name.getName() + "ович");
            }
            if (this.gender == 'ж' && this.father != null) {
                this.name.setMiddleName(this.father.name.getName() + "овна");
            }
        }
        String s1 = this.name +  ", рост: " + this.height;
        return s1;
    }

}
