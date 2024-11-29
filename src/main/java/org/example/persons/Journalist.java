package org.example.persons;


import org.example.interfaces.Search;

public record Journalist(String name, int age, Mood mood, Places currentPlaces) implements Search {


    @Override
    public String search(Alive person) {
        if (this.currentPlaces == person.currentPlaces) {
            return "Заметил "+person.name;
        }
        return "Не заметил "+person.name;
    }

    public String doPhoto(Alive person) {
        return "Сфоткал " + person.name;

    }

    public void doNewsPaper() {}

    public String PaperArticle(String paperName) {
        return paperName;

    }
}
