package org.example;
import org.example.exceptions.*;
import org.example.persons.*;
import org.example.world.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Father papa = new Father("Андрей",52, Mood.DELIGHTFUL, Room.LIVINGROOM);
        Mother mama = new Mother("Карина", 69, Mood.DELIGHTFUL, Room.LIVINGROOM);
        Baby child = new Baby("Арсений",5,Mood.GOOD, Room.BEDROOM);
        Carlson carlson = new Carlson("Поляков", 8, Mood.NORMAL, Room.LIVINGROOM);
        Journalist reporter = new Journalist("Амогус",32, Mood.NORMAL, Room.OFFICE);
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Выберите погоду:\n1-Хорошая \n2-Плохая");
            int choice = sc.nextInt();
            if (choice > 2 || choice < 1) {
                throw new InvalidArgumentException();
            }
            System.out.println("Выберите день недели: \n1-Понедельник\n2-Вторник\n3-Среда\n4-Четверг" +
                    "\n5-Пятница\n6-Суббота\n7-Воскресенье");
            int choice2 = sc.nextInt();
            if ( choice2 >= 7 || choice2 <= 0) {
                throw new InvalidArgumentException();
            }
            if (choice == 2) {
                carlson.setMood(Mood.BAD);
                System.out.print("Был обычный " + Days.values()[choice2-1]+" Погода была "+Weather.values()[choice-1]+
                        " " + carlson.getName()+
                        " было грустно.\nПоэтому он решил себя порадовать тем, что покушает варенья.");
                System.out.print(carlson.fly(Room.KITCHEN));
                System.out.print(" После чего он съедает варенье.");
                carlson.eatJelly();
                System.out.println("");
            }
        } catch (InvalidArgumentException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        } /*catch (InvalidTypeOfArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Введите нужный тип данных");
            System.exit(0);
        }*/
    }
}

