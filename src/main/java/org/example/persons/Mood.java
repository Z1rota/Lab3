package org.example.persons;

public enum Mood {
    GOOD("хорошее"),
    BAD("плохое"),
    DELIGHTFUL("восхитительное"),
    DISSAPOINTED("разочарован"),
    TIRED("уставший"),
    NORMAL("нормальное"),
    CONFUSED("озадачен"),
    SCARED("напуган");

private String name;
    private Mood(String name) {
        this.name = name;
    }
@Override
    public String toString() {
        return name;
}
}
