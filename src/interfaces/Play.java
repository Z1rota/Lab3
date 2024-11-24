package interfaces;

import classes.Alive;

public interface Play {
     void play();

     default void play(Alive friend) {}

}
