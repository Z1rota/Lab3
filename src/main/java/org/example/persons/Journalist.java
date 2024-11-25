package org.example.persons;


import org.example.interfaces.Search;

public record Journalist(String name, int age, Mood mood, Room currentRoom) implements Search {


    @Override
    public String search(Alive person) {
        if (this.currentRoom == person.currentRoom) {
            return "Заметил "+person.name;
        }
        return "Не заметил "+person.name;
    }

    public String doPhoto(Alive person) {
        return "Сфоткал" + person.name;

    }


    public String doNewsPaper(String paperName) {
        return "Выпустил пост в газету с заголовком " + paperName;

    }
}
