package classes;

import interfaces.Search;

public class Father extends Alive implements Search {
    public Father(String name, int age, Mood mood, Room room) {
        super(name,age,mood,room);
    }

    @Override
    public boolean Search(Alive person) {
        if (this.currentRoom == person.currentRoom){
            return true;
        }
        return false;
    }



}
