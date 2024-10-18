import java.util.Scanner;

//WRITE JAVADOC FOR EACH METHOD!

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String userName = "";
        int testInt = 0;
        double testDouble = 0.0;
        int testIntRanged = 0;
        double testDoubleRanged = 0.0;

        //userName = getNonZeroLenString(in, "Please enter your username");
        //System.out.println("\nYour username is: " + userName + ".");

        //testInt = getInt(in, "Please enter an integer");
        //System.out.println("\nYour integer is: " + testInt + ".");

        //testDouble = getDouble(in, "Please enter a double");
        //System.out.println("\nYour double is: " + testDouble + ".");

        //testIntRanged = getRangedInt(in, "Please enter an integer", 1, 10);
        //System.out.println("\nYour ranged integer is: " + testIntRanged + ".");

        testDoubleRanged = getRangedDouble(in, "Please enter a double", 1.0, 10.0);
        System.out.println("\nYour ranged double is: " + testDoubleRanged + ".");
    }

    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */

    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = ""; // Set this to zero length. Loop runs until it isn't
        do
        {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;
    }

    public static int getInt(Scanner pipe, String prompt)
    {
        int retInt = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            if(pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }else {
                trash = pipe.nextLine();
                System.out.println("\nPlease enter an integer. You entered: " + trash + ".");
            }
        }while(!done);
        return retInt;
    }

    public static double getDouble(Scanner pipe, String prompt)
    {
        double retDouble = 0.0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            if(pipe.hasNextDouble()) {
                retDouble = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }else {
                trash = pipe.nextLine();
                System.out.println("\nPlease enter a numeric value. You entered: " + trash + ".");
            }
        }while(!done);
        return retDouble;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retRangedInt = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + "[" + low + "-" + high + "]: ");
            if(pipe.hasNextInt())
            {
                retRangedInt = pipe.nextInt();
                pipe.nextLine();
                if(retRangedInt >= low && retRangedInt <= high) {
                    done = true;
                }else {
                    System.out.println("\nThe number you input is out of range. Please enter a number at or between " + low + " and " + high + ". You entered: " + retRangedInt + ".");
                }
            }else {
                trash = pipe.nextLine();
                System.out.println("\nPlease enter an integer at or between " + low + " and " + high + ". You entered: " + trash + ".");
            }
        }while(!done);
        return retRangedInt;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retRangedDouble = 0.0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + "[" + low + "-" + high + "]: ");
            if(pipe.hasNextDouble())
            {
                retRangedDouble = pipe.nextDouble();
                pipe.nextLine();
                if(retRangedDouble >= low && retRangedDouble <= high)
                {
                    done = true;
                }else {
                    System.out.println("\nThe number you input is out of range. Please enter a number at or between " + low + " and " + high + ". You entered: " + retRangedDouble + ".");
                }
            }else {
                trash = pipe.nextLine();
                System.out.println("\nPlease enter a double at or between " + low + " and " + high + ". You entered: " + trash + ".");
            }
        }while(!done);
        return retRangedDouble;
    }

    //come back for getYNConfirm

}
