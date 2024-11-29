package org.example.world;

public enum Days {
    MONDAY("понедельник"),
    TUESDAY("вторник"),
    WEDNESDAY("среда"),
    THURSDAY("четверг"),
    FRIDAY("пятница"),
    SATURDAY("суббота"),
    SUNDAY("воскресенье");
private String name;
private Days(String name) {
    this.name = name;
}
    @Override
    public String toString() {
    return name;
    }
}
