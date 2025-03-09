package app;

public class Main {
    private static final double MILE_TO_KM = 1.60934;

    // Метод для конвертації миль у кілометри
    private static double convertMilesToKm(double miles) {
        return miles * MILE_TO_KM;
    }

    public static void main(String[] args) {
        System.out.println("Converter App: Miles ↔ Kilometers");

        double miles = 5;
        System.out.println(miles + " miles = " + convertMilesToKm(miles) + " km");
    }
}
