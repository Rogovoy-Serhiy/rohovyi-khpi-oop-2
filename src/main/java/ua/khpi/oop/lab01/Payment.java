package ua.khpi.oop.lab01;

public class Payment {
    private double amount;
    private String method;

    public Payment(double amount, String method) {
        this.amount = amount;
        this.method = method;
    }

    public Payment(double amount) {
        this.amount = amount;
        this.method = "card";
    }

    public double getAmount() {
        return amount;
    }

    public String getMethod() {
        return method;
    }

    @Override
    public String toString() {
        return "Payment{amount=" + amount + ", method='" + method + "'}";
    }
}
