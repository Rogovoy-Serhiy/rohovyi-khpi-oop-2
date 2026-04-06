package ua.khpi.oop.lab01;

public class Rental {
    private User user;
    private Bicycle bicycle;
    private String date;

    public Rental(User user, Bicycle bicycle, String date) {
        this.user = user;
        this.bicycle = bicycle;
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public Bicycle getBicycle() {
        return bicycle;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Rental{user=" + user + ", bicycle=" + bicycle + ", date='" + date + "'}";
    }
}
