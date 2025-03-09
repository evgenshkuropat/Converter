package app;

public class Main {
    private static final double MILE_TO_KM = 1.60934;

    // Метод для конвертації миль у кілометри
    private static double convertMilesToKm(double miles) {
        return miles * MILE_TO_KM;
    }

    // Метод для конвертації кілометрів у милі
    private static double convertKmToMiles(double km) {
        return km / MILE_TO_KM;
    }

    public static void main(String[] args) {
        System.out.println("Converter App: Miles ↔ Kilometers");

        double miles = 5;
        double km = 8;

        System.out.println(miles + " miles = " + convertMilesToKm(miles) + " km");
        System.out.println(km + " km = " + convertKmToMiles(km) + " miles");
    }
}
