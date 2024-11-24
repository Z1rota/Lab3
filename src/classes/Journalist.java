package classes;


import interfaces.Search;

public class Journalist extends Alive implements Search {
    public Journalist(String name, int age, Mood mood, Room room) {
        super(name, age, mood, room);
    }

    boolean photo = false;

    @Override
    public boolean Search(Alive person) {
        if (this.currentRoom == person.currentRoom) {
            return true;
        }
        return false;
    }

    public void doPhoto() {
        this.mood = Mood.DELIGHTFUL;
        this.photo = true;
    }


    public String doNewsPaper() {
        if (this.currentRoom == Room.OFFICE && this.photo) {
            this.mood = Mood.TIRED;
            return "Газета выпущена";
        }
        if (this.currentRoom != Room.OFFICE) {
            return "Еще не на работе";
        }
        return "Нет какого-то классного фото для газеты";
    }
}
