import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String socialSecurity = "";
        String mNumber = "";
        String menuChoice = "";

        socialSecurity = SafeInput.getRegExString(in, "Enter your social security number", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("\nYour social security number is: " + socialSecurity + ".");

        mNumber = SafeInput.getRegExString(in, "Enter your M number", "^(M|m)\\d{5}$");
        System.out.println("\nYour M number is: " + mNumber + ".");

        menuChoice = SafeInput.getRegExString(in, "Enter your menu choice: O, S, V, or Q", "^[OoSsVvQq]$");

        if(menuChoice.equalsIgnoreCase("o")) {
            System.out.println("\nYou chose Open! " + menuChoice);
        } else if(menuChoice.equalsIgnoreCase("s")) {
            System.out.println("\nYou chose Save! " + menuChoice);
        } else if(menuChoice.equalsIgnoreCase("v")) {
            System.out.println("\nYou chose View! " + menuChoice);
        } else {
            System.out.println("\nYou chose Quit! " + menuChoice);
        }
    }
}
