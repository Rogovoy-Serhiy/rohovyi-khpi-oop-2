package ua.khpi.oop.lab01;

public class Station {
    private String name;
    private int capacity;

    public Station(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public Station(String name) {
        this.name = name;
        this.capacity = 10;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Station{name='" + name + "', capacity=" + capacity + "}";
    }
}
