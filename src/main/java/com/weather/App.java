package com.weather;

/**
 * Weather
 *
 */
public class App {

    public static String forecast(String currentWeather) {
        switch (currentWeather) {
            case "sunny":
                return "Wear a shirt";
            case "rainy":
                return "Bring an umbrella";
            case "snowy":
                return "Dress warm";
            default:
                return "Invalid forecast";
        }
    }

    public static void main(String[] args) {
        System.out.println(forecast("sunny"));
        System.out.println(forecast("rainy"));
        System.out.println(forecast("snowy"));
        System.out.println(forecast("stormy"));
    }
}
