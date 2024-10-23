import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        prettyHeader("This is my message");
    }

    public static void prettyHeader(String msg)
    {
        int msgLength = 0;
        int totalLength = 54;
        int lengthSubtracted = 0;
        double initialPaddingLength = 0.0;
        double roundedPaddingLength = 0.0;
        int paddingLength1 = 0;
        int paddingLength2 = 0;

        msgLength = msg.length();

        for(int row = 1; row <= 3; row++)
        {
            if(row == 1 || row == 3) {
                for(int column = 1; column <= 60; column++){
                    System.out.print("*");
                }
            }else {
                System.out.print("***");
                lengthSubtracted = totalLength - msgLength;

                if(lengthSubtracted % 2 == 0) {
                    initialPaddingLength = lengthSubtracted/2.0;
                    roundedPaddingLength = Math.round(initialPaddingLength);
                    paddingLength1 = (int)roundedPaddingLength;
                    paddingLength2 = paddingLength1;
                } else {
                    initialPaddingLength = lengthSubtracted/2.0;
                    roundedPaddingLength = Math.round(initialPaddingLength);
                    paddingLength1 = (int)roundedPaddingLength;
                    paddingLength2 = paddingLength1;

                    if(roundedPaddingLength * 2 > lengthSubtracted) {
                        paddingLength1--;
                    } else if(roundedPaddingLength * 2 < lengthSubtracted) {
                        paddingLength2++;
                    }
                }

                for(int column = 1; column <= paddingLength1; column++) {
                    System.out.print(" ");
                }

                System.out.print(msg);

                for(int column = 1; column <= paddingLength2; column++) {
                    System.out.print(" ");
                }

                System.out.print("***");
            }
            System.out.println();
        }

    }
}
