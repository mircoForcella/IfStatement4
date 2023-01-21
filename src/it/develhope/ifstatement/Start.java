package it.develhope.ifstatement;

import it.develhope.ifstatement.entities.Person;

public class Start {
    public static void main(String[] args) {
    Person person = new Person();

    System.out.println("Age: "+ person.getAge());
    System.out.println("The person is in the "+person.getLifeStage()+ " stage of life");
    }
}
