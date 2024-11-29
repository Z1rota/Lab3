package org.example.persons;

import java.util.ArrayList;
import java.util.List;

 public abstract class Alive {
    String name;
    int age;
    Mood mood;
    Places currentPlaces;
    List<Object> friendArray = new ArrayList<>();
    public Alive(String name, int age, Mood mood, Places currentPlaces) {
        this.name = name;
        this.age = age;
        this.mood = mood;
        this.currentPlaces = currentPlaces;
    }

    public abstract String hello();
    public void walksTo(Places placesName){
        currentPlaces = placesName;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    };
    public Mood getMood() {
        return mood;
    }
    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public Places getCurrentPlace() {
        return currentPlaces;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Mood: " + mood;
}
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Alive) {
            Alive h = (Alive) obj;
            return h.getName().equals(this.getName()) && h.getAge() == this.getAge();
        }
        return false;
    }
    @Override
    public int hashCode() {
        return name.hashCode() + age + mood.hashCode();
    }
}
