package interfaces;

import classes.Alive;

public interface Search {
    default boolean Search(Alive person) {
        return false;
    }
}
