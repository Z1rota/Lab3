package org.example.persons;

public enum Places {
    KITCHEN("кухня"),
    LIVINGROOM("гостиная"),
    BEDROOM("спальня"),
    ATTIC("чердак"),
    OUTSIDE("улица"),
    OFFICE("офис"),
    HALLAWAY("прихожая"),
    ITMO("университет");


    private String name;
     private Places(String name) {
        this.name=name;
    }
    @Override
    public String toString() {
         return name;
}
}
