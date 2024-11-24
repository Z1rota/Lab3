package interfaces;

import classes.Alive;

public interface HasFriends {
    default void addFriend(Alive friend) {};
    default void removeFriend(Alive friend) {};
    default String checkFriends() {return null;};
}
