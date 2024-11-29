package org.example.world;

public enum Weather {
    NORMAL("нормальная"),
    BAD("плохая");

private String name;
private Weather(String name) {
    this.name = name;
}
    @Override
    public String toString() {
        return name;
    }
}
