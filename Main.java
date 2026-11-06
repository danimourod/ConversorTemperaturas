public class Main {
    public static void main(String[] args) {

        System.out.println("CELSIUS A FAHRENHEIT");

        System.out.println("0 C = "
                + ConversorTemperaturas.celsiusAFahrenheit(0) + " F");

        System.out.println("100 C = "
                + ConversorTemperaturas.celsiusAFahrenheit(100) + " F");

        System.out.println("-40 C = "
                + ConversorTemperaturas.celsiusAFahrenheit(-40) + " F");

        System.out.println();

        System.out.println("FAHRENHEIT A CELSIUS");

        System.out.println("32 F = "
                + ConversorTemperaturas.fahrenheitACelsius(32) + " C");

        System.out.println("212 F = "
                + ConversorTemperaturas.fahrenheitACelsius(212) + " C");

        System.out.println("-40 F = "
                + ConversorTemperaturas.fahrenheitACelsius(-40) + " C");
    }
}
