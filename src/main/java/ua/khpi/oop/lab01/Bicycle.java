package ua.khpi.oop.lab01;

public class Bicycle {
    private String id;
    private String model;
    private boolean available;

    public Bicycle(String id, String model) {
        this.id = id;
        this.model = model;
        this.available = true;
    }

    public Bicycle(String id, String model, boolean available) {
        this.id = id;
        this.model = model;
        this.available = available;
    }

    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public boolean isAvailable() {
        return available;
    }

    public void rent() {
        this.available = false;
    }

    public void returnBike() {
        this.available = true;
    }

    @Override
    public String toString() {
        return "Bicycle{id='" + id + "', model='" + model + "', available=" + available + "}";
    }
}
