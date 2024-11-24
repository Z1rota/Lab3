package interfaces;

import classes.Room;

public interface Flyable {
    default void fly(Room room) {};
}
