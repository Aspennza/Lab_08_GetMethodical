import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0.0;
        double totalPrice = 0.0;
        boolean notDone = true;

        do {
            itemPrice = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 10.00);
            totalPrice = totalPrice + itemPrice;
            notDone = SafeInput.getYNConfirm(in, "Would you like to continue inputting items?");
        }while(notDone);

        System.out.printf("\nThe total price of your items is $%3.2f.", totalPrice);
    }
}
