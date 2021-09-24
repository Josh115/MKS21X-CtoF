// The functions should have Doubles as paramerters, celsiusToFahrenheit() should have a Celsius degree as input and return an equal Fahrenheit degree.
// fahrenheitToCelsius() should take a Fahrenheit degree and return a Celsius degree
public class CtoFTester {

    public static void main(String[]args) {
        System.out.println("100 CtoF: " + celsiusToFahrenheit(100.0));
        System.out.println("100 FtoC: " + fahrenheitToCelsius(100.0));
        System.out.println("-100 CtoF: " + celsiusToFahrenheit(-100.0));
    }
    // C to F is : (C × 9/5) + 32 = F
    public static double celsiusToFahrenheit(double C) {
        double f = (C * (9.0 / 5.0)) + 32;
        return f;
    }
    // F to C is : (F − 32) × 5/9 = C
    public static double fahrenheitToCelsius(double F) {
        double c = (F - 32) * (5.0 / 9.0);
        return c;
    }
}
