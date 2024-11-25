package org.example.interfaces;

import org.example.persons.Alive;

public interface HasFriends {
    void addFriend(Alive friend);
    void removeFriend(Alive friend);
    String checkFriends();
}
