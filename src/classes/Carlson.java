package classes;

import interfaces.*;

public class Carlson extends Alive implements Flyable, WindowWatch, HasFriends, Play, Search {
    public Carlson(String name, int age, Mood mood, Room room) {
        super(name,age,mood,room);
    }

    @Override
    public void fly(Room room) {
        this.currentRoom = room;
    }

    @Override
    public boolean WatchThroughWindow(Alive person) {
        Room temp = this.currentRoom;
        this.currentRoom = Room.OUTSIDE;
        if (this.currentRoom == person.currentRoom) {
            this.currentRoom = temp;
            return true;

        }
        this.currentRoom = temp;
        return false;
    }

    @Override
    public boolean Search(Alive person) {
        return this.currentRoom == person.currentRoom;
    }


    public void eatJelly() {
        this.mood = Mood.DELIGHTFUL;
    }

    @Override
    public void play() {
        this.mood = Mood.GOOD;
    }
    @Override
    public void play(Alive friend) {
        this.mood = Mood.GOOD;
        friend.mood = Mood.GOOD;
    }

    @Override
    public void addFriend(Alive friend) {
        friendArray.add(friend);
    }

    @Override
    public void removeFriend(Alive friend) {
        friendArray.remove(friend);
    }

    @Override
    public String checkFriends() {
        String friends = "";
        for (int i = 0; i < friendArray.size(); i++) {
            if (friendArray.get(i) != null) {
                friends += friendArray.get(i) + " ";
            }
        }
        if (friends.equals("")) {
            return "У тебя нет друзей)";
        }
        return friends;
    }

}
