import classes.Baby;
import classes.Father;
import classes.Mood;
import classes.Room;

public class Main {
    public static void main(String[] args) {
        Baby a = new Baby("maks",12, Mood.BAD, Room.BEDROOM);
        Baby b = new Baby("saks",15, Mood.NOTVOSTORG, Room.BEDROOM);
        Baby c = new Baby("boba",15, Mood.GOOD, Room.BEDROOM);
        Father papa = new Father("eblan", 69, Mood.DELIGHTFUL, Room.BEDROOM);
        System.out.println(papa.Search(a));
        a.addFriend(b);
        a.addFriend(c);
        a.play(b);
        a.walksTo(Room.ATTIC);
        System.out.println(papa.Search(a));
        System.out.println(a.getCurrentRoom());
        System.out.println(b.getMood());
    }
}
