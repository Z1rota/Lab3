package org.example.persons;


import org.example.interfaces.Search;

public class Mother extends Alive implements Search {
    public Mother(String name, int age, Mood mood, Room room) {
        super(name,age,mood,room);
    }

    @Override
    public String hello() {
        return "Привет, я " +this.name + " меня бьет мой муж";
    }
    @Override
    public String search(Alive person) {
        if (this.currentRoom == person.currentRoom) {
            return this.name + " Нашел " + person.name;
        }
        return this.name + " Не нашел " + person.name;
    }
}
