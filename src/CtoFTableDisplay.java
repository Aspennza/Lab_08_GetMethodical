public class CtoFTableDisplay
{
    public static void main(String[] args)
    {
        double fahrenheit = 0.0;

        System.out.println("Celsius       Fahrenheit");
        System.out.println("------------------------");

        for(double celsius = -100; celsius <= 100; celsius++)
        {
            fahrenheit = CtoF(celsius);

            System.out.printf("%7.2f       %7.2f", celsius, fahrenheit);
            System.out.println();
        }
    }

    /**
     * Receives a double value in Celsius and converts it to a double value in Fahrenheit
     *
     * @param Celsius a Celsius double value input by the programmer
     * @return a double value in Fahrenheit
     */
    public static double CtoF(double Celsius)
    {
        double fahrenheit = 0.0;

        fahrenheit = (Celsius * 9/5) + 32;

        return fahrenheit;
    }

}
