package classes;

import interfaces.HasFriends;
import interfaces.Play;

public class Dog extends Alive implements HasFriends, Play {
    public Dog(String name, int age, Mood mood, Room room) {
        super(name,age,mood,room);

    }
    public void play() {
        this.mood = Mood.GOOD;
    }

    public void play(Alive friend) {
        this.mood = Mood.GOOD;
        friend.mood = Mood.GOOD;
    }

    @Override
    public String checkFriends() {
        String friends="";
        for (int i =0; i< friendArray.size(); i++){
            if (friendArray.get(i) != null) {
                friends+=friendArray.get(i)+" ";
            }
            if (friends.equals("")) {
                return "У тебя нет друзей)";
            }
        }
        return friends;
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
    public String toString() {
        return "Woof Woof " + name+ " Woof " + age+ " Woof Wooof " + mood + "Wooooof" + currentRoom;
    }
}
