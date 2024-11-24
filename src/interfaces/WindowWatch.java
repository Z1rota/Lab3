package interfaces;

import classes.Alive;

public interface WindowWatch {
    default boolean WatchThroughWindow(Alive person) {};
}
