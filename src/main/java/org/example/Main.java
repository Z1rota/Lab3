package org.example;

import org.example.exceptions.InvalidArgumentException;
import org.example.exceptions.InvalidTypeOfArgumentException;
import org.example.persons.*;
import org.example.world.*;
import java.util.Random;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Father papa = new Father("Андрей", 52, Mood.DELIGHTFUL, Places.LIVINGROOM);
        Mother mama = new Mother("Карина", 69, Mood.DELIGHTFUL, Places.LIVINGROOM);
        Baby child = new Baby("Арсений", 5, Mood.GOOD, Places.BEDROOM);
        Dog psina = new Dog("Клименков",8, Mood.NORMAL, Places.OUTSIDE);
        Carlson carlson = new Carlson("Поляков", 8, Mood.NORMAL, Places.LIVINGROOM);
        Journalist journalist = new Journalist("Амогус", 32, Mood.NORMAL, Places.OFFICE);
        Scanner sc = new Scanner(System.in);
            try {
                System.out.println("Выберите погоду:\n1-Хорошая \n2-Плохая");
                if (!sc.hasNextInt()) {
                    throw new InvalidTypeOfArgumentException();
                }
                int choice = sc.nextInt();
                if (choice > 2 || choice < 1) {
                    throw new InvalidArgumentException();

                }
                System.out.println("Выберите день недели: \n1-Понедельник\n2-Вторник\n3-Среда\n4-Четверг" +
                        "\n5-Пятница\n6-Суббота\n7-Воскресенье");
                if (!sc.hasNextInt()) {
                    throw new InvalidTypeOfArgumentException();
                }
                 int choice2 = sc.nextInt();
                if (choice2 > 7 || choice2 <= 0) {
                    throw new InvalidArgumentException();
                }
                if (choice == 2) {
                    carlson.setMood(Mood.BAD);
                    System.out.print("Был обычный " + Days.values()[choice2 - 1] + " Погода была " + Weather.values()[choice - 1] +
                            " " + carlson.getName() + " настроение" +
                            " было " + carlson.getMood()+ ".\nПоэтому он решил себя порадовать тем, что покушает варенья.");
                    System.out.print(carlson.fly(Places.KITCHEN));
                    System.out.print(" После чего быстро принялся поедать варенье.\n");
                    carlson.eatJelly();
                    papa.setMood(Mood.CONFUSED);
                    mama.setMood(Mood.CONFUSED);
                    System.out.println("Родители,озадаченные услышанным с кухни чавканьем пошли искать виновника");
                    papa.walksTo(Places.KITCHEN);
                    mama.walksTo(Places.KITCHEN);
                    papa.search(carlson);
                    mama.search(carlson);
                    System.out.print("Найдя виновника торжества родители разозлились\n");
                    papa.setMood(Mood.BAD);
                    mama.setMood(Mood.BAD);
                    System.out.println(mama.getName()+": Это было варенье на новый год...");
                    System.out.println(papa.getName()+": Вали отсюда, самолет дефектный!");
                    child.walksTo(Places.KITCHEN);
                    System.out.println("На крики прибежал "+child.getName()+ ". Увидев, что его любимого варенья нет " +
                            child.getName()+" начал плакать");
                    carlson.setMood(Mood.SCARED);
                    System.out.println(carlson.getName()+" Очень испугался, и под страхом наказания решил " +
                            "вылететь на улицу из окна");
                    carlson.fly(Places.OUTSIDE);
                    System.out.println("Карлсон вылетел как пуля из окна, но это заметил мимо проходящий человек");
                    System.out.println("К сожалению,это был журналист " + journalist.name() + " Который сфоткал малыша "
                    + carlson.getName());
                    journalist.doPhoto(carlson);
                    journalist.doNewsPaper();
                    System.out.println("НА СЛЕДУЮЩИЙ ДЕНЬ");
                    System.out.println(papa.getName()+" "+mama.getName()+" Простили " + carlson.getName()+
                    " и позволили ему вернутся домой");
                    System.out.println("К сожалению, утром на кухне вся семья увидела зашедшего с газетой " +
                            papa.getName());
                    System.out.println("Посмотрев в газету можно было заметить\n"+journalist.PaperArticle("Домашний Карлсон"));
                    System.out.println(papa.getName()+" "+mama.getName()+ " Были разочарованы,а "+carlson.getName()+
                            " был рад своей популярности");
                    papa.setMood(Mood.DISSAPOINTED);
                    mama.setMood(Mood.DISSAPOINTED);
                    carlson.setMood(Mood.DELIGHTFUL);
                    System.out.println("В последствии "+carlson.getName() + " Выгнали из дома и он сторчался)");
                    System.out.println("Конец!");



                } else {
                    carlson.setMood(Mood.GOOD);
                    System.out.println("Был обычный " + Days.values()[choice2 - 1] + " Погода была " + Weather.values()[choice - 1] +
                            " у " + carlson.getName() +
                            " было " + carlson.getMood() + " Настроение.\nПоэтому он решил поиграть с "+ psina.getName());
                    System.out.println("Но для начала ему нужно было найти " + psina.getName()+ " С чего бы начать?");
                    System.out.println("Где ему искать собаку?\n1-Кухня\n2-Гостиная\n3-Спальня\n4-Чердак\n5-посмотреть в окно");
                    if (!sc.hasNextInt()) {
                        throw new InvalidTypeOfArgumentException();
                    }
                    int choice3 = sc.nextInt();
                    if (choice3 < 1 || choice3 > 5) {
                        throw new InvalidArgumentException();
                    }
                    while (choice3 !=5) {
                        System.out.println(carlson.getName()+ " Пошел на " + Places.values()[choice3-1].toString());
                        carlson.fly(Places.values()[choice3-1]);
                        System.out.println(carlson.search(psina));
                        choice3 = sc.nextInt();
                    }
                    carlson.watchThroughWindow(psina);
                    System.out.println(carlson.getName()+" увидел " +psina.getName() + " на " +psina.getCurrentPlace());
                    System.out.println(carlson.getName()+ " Решил открыть окно и спуститься к " +psina.getName() +
                            " для того, чтоб поиграть");
                    carlson.fly(Places.OUTSIDE);
                    Random r = new Random();
                    if (r.nextInt() < 0.2) {
                        System.out.println("Во время героического полета ничего не случилось и " + carlson.getName() +
                                " благополучно приземлился и пошел играть");
                        carlson.play(psina);
                        System.out.println("Поиграв с собакой " +carlson.getName() + " решил что:\n1-пойдет домой\n2-" +
                                "еще немного погуляет");
                        if (!sc.hasNextInt()) {
                            throw new InvalidTypeOfArgumentException();
                        }
                        int choice4 = sc.nextInt();
                        if (choice4 < 1 || choice4 > 2) {
                            throw new InvalidArgumentException();
                        }
                        if (choice4 == 2) {
                            System.out.println(carlson.getName() + " решил, что нужно прогуляться вокруг дома");
                            System.out.println("В какой-то момент главный герой ощутил сильный удар по голове");
                            carlson.setMood(Mood.CONFUSED);
                            System.out.println("Только к самой ночи малыш, который так и не смог найти " +
                                    carlson.getName() + "пришел жаловаться родителям.\nИ вся семья отправилась на поиски");
                            System.out.println("Карлсон " +carlson.getName() + " был найден.... верхняя часть его тела" +
                                            " стала комбинацией 0-кубов, а нижняя\nСТАЛА КУБОМ ПОКРЫТИЯ!");
                            System.out.println("Конец");

                        }
                        System.out.println(carlson.getName()+" Решил, что нужно возвращаться домой подкрепиться");
                        carlson.walksTo(Places.HALLAWAY);
                        papa.walksTo(Places.HALLAWAY);
                        mama.walksTo(Places.HALLAWAY);
                        System.out.println("Поднявшись домой он увидел рассерженных родителей малыша");
                        papa.setMood(Mood.BAD);
                        mama.setMood(Mood.BAD);
                        System.out.println(mama.getName()+": И где ты шлялся без нашего разрешения?");
                        System.out.println(papa.getName()+": Я ведь тебя предупреждал, еще один такой трюк, и я тебя " +
                                "Выгоню из дома");
                        System.out.println("Родителям малыша не нужно было привлечения лишнего внимания от властей " +
                                "из-за карлсона");
                        System.out.println("И ведь в самом деле, они беспокоятся за ребенка, поэтому предсказать " +
                                "дальнейшие события было легко" );
                        System.out.println(papa.getName()+": выгоняет из дома " + carlson.getName());
                        carlson.walksTo(Places.OUTSIDE);
                        System.out.println("Опечаленный " +carlson.getName()+" случайно набрел на университет ИТМО");
                        carlson.walksTo(Places.ITMO);
                        System.out.println("Там его встретили с распростертыми объятиями, назначили преподавателем");
                        System.out.println("После чего он стал рассказывать студентам про КУБЫ, заправляя это анекдотами");

                    }else {
                        System.out.println("Пока " +carlson.getName()+ " спускался, это заметил какой-то" +
                                " стоящий в окне человек");
                        System.out.println("этим человеком оказался журналист " +journalist.name() + " сфоткавший " +
                                "летевшего карлсона");
                        System.out.println(journalist.doPhoto(carlson));
                        journalist.doNewsPaper();
                        System.out.println("После этого "+journalist.name()+" побежал писать об этом в газете");
                        System.out.println(carlson.getName()+" Спустился и пошел играть с " +psina.getName());
                        carlson.play(psina);
                        System.out.println("Поиграв с собакой " +carlson.getName() + " герой был очень уставший и решил" +
                                " подкрепиться");
                        carlson.fly(Places.KITCHEN);
                        System.out.println(carlson.getName()+" осторожно залетел обратно в окно.\n" +
                                "После чего аккуратно сьел немного варенья из холодильника, пошел спать на чердка");
                        carlson.eatJelly();
                        carlson.walksTo(Places.ATTIC);
                        System.out.println("Наступил " + Days.values()[choice2%7]+" Наш" +carlson.getName() +
                                " Проснулся с таким же хорошим настроением и пошел кушать");
                        carlson.walksTo(Places.KITCHEN);
                        System.out.println("придя на" +carlson.getCurrentPlace() + " он увидел рассерженных родителей");
                        papa.walksTo(Places.KITCHEN);
                        mama.walksTo(Places.KITCHEN);
                        child.walksTo(Places.KITCHEN);
                        papa.setMood(Mood.BAD);
                        mama.setMood(Mood.BAD);
                        System.out.println(mama.getName()+": Малыш, иди к себе в комнату, нам нужно поговорить с " +
                                carlson.getName());
                        System.out.println("Малыш молча ушел к себе в комнату");
                        child.walksTo(Places.BEDROOM);
                        System.out.println(papa.getName()+" Показывает газету с заголовком"+
                                journalist.PaperArticle("Домашний летающий Карлсон, шок!"));
                        System.out.println(papa.getName()+": А ведь я предупреждал... Вон!");
                        System.out.println(carlson.getName()+ " Испугался и быстро улетел прочь");
                        carlson.fly(Places.OUTSIDE);
                        System.out.println("Через пару дней из заголовков газет родители малыша узнали, что " +
                                carlson.getName()+ " был пойман за сбыт наркотиков в огромных количествах");
                        System.out.println("КОНЕЦ!");


                    }


                }
            } catch (InvalidArgumentException e) {
                System.out.println(e.getMessage());
            } catch (InvalidTypeOfArgumentException e) {
                System.out.println(e.getMessage());


        }
    }
}

