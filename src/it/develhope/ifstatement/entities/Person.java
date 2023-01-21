package it.develhope.ifstatement.entities;

public class Person {
    private int age;

    public Person() {
        this.setAge((int) Math.floor(Math.random() * (80 - 5 + 1) + 5));
    }

    public String getLifeStage() {
        if (getAge() <= 12) {
            return "child";
        } else if (getAge() >= 13 && getAge() <= 19) {
            return "Teen";
        } else if (getAge() >= 20 && getAge() <= 59) {
            return "Adult";
        } else {
            return "Senior Adult";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}