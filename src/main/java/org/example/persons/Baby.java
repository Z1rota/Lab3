package org.example.persons;

import org.example.interfaces.HasFriends;
import org.example.interfaces.Play;

public class Baby extends Alive implements HasFriends, Play {
    public Baby(String Name, int age, Mood mood, Places currentPlaces){
        super(Name,age,mood, currentPlaces);
    }
    @Override
    public void addFriend(Alive friend) {
        friendArray.add(friend);

    }
    @Override
    public String hello() {
        return "Привет, я " +this.name+ " ГОЙДА!";
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


    public void play() {
        this.mood = Mood.GOOD;
    }

    public void play(Alive friend) {
        if (friendArray.contains(friend)) {
            this.mood = Mood.GOOD;
            friend.mood = Mood.GOOD;
        }
    }

}
