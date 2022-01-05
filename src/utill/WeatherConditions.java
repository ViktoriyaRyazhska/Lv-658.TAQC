package utill;

public enum WeatherConditions {
    clear,
    sunny,
    cloud,
    rainy,
    windy,
    thunderstorms,
    overcast;

    public static WeatherConditions[] getConditions() {
        WeatherConditions[] weatherConditions = WeatherConditions.values();
        return weatherConditions;
    }
}

