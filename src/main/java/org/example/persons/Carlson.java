package org.example.persons;

import org.example.interfaces.*;

public class Carlson extends Alive implements Flyable, WindowWatch, HasFriends, Play, Search {
    public Carlson(String name, int age, Mood mood, Room room) {
        super(name,age,mood,room);
    }

    @Override
    public String hello() {
        return "Привет, я " +this.name+ " ГОЙДА!";
    }

    @Override
    public String fly(Room room) {
        this.currentRoom = room;
        return this.name+" Прилетел на "+room;
    }

    @Override
    public boolean WatchThroughWindow(Alive person) {
        return person.currentRoom == Room.OUTSIDE;
    }

    @Override
    public String search(Alive person) {
        if (this.currentRoom == person.currentRoom) {
            return this.name + " Нашел " + person.name;
        }
        return this.name + " Не нашел " + person.name;
    }


    public String eatJelly() {
        this.mood = Mood.DELIGHTFUL;
        return this.name + " громко поел вкусного варенья";
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
