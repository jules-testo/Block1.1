public class TemperatureDemo1 {
    public static void main(String[] args) {

        double temperatureCelsius = 11.8;
        double temperatureCelsius1 = 4.8;

        double fahrenheit = celsiusToFahrenheit(temperatureCelsius);
        double fahrenheit1 = celsiusToFahrenheit(temperatureCelsius1);

        System.out.println("Aktuelle Temperatur 1 " + temperatureCelsius + " in Celsius entspricht " + fahrenheit + " in Fahrenheit");


    }

    public static double celsiusToFahrenheit (double celsius) {

        double result = celsius * 1.8 + 32;
        return result;
    }
}
{
}
