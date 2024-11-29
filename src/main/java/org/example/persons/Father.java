package org.example.persons;

import  org.example.interfaces.Search;

public class Father extends Alive implements Search {
    public Father(String name, int age, Mood mood, Places places) {
        super(name,age,mood, places);
    }

    @Override
    public String hello() {
        return "Привет, я " +this.name+ " Во всем виновата Америка";
    }


    @Override
    public String search(Alive person) {
        if (this.currentPlaces == person.currentPlaces) {
            return this.name + " Нашел " + person.name;
        }
        return this.name + " Не нашел " + person.name;
    }



}
