package classes;


import interfaces.Search;

public class Mother extends Alive implements Search {
    public Mother(String name, int age, Mood mood, Room room) {
        super(name,age,mood,room);
    }

    @Override
    public boolean Search(Alive person) {
        return this.currentRoom == person.currentRoom;
    }
}
