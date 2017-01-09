import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleMenu {

    private static String path;
    private static int number;

    public void consoleMenu () {

        //enter filepath
        System.out.println("Enter the file path* (mandatory)");

        Scanner str = new Scanner(System.in);
        this.path = str.nextLine();

        //enter number of strings
        Scanner in;

        boolean endInput = true;
        int select = 0;

        do {
            System.out.println("Do you want to enter number of strings to select from file? \n");
            System.out.println("1. Yes");
            System.out.println("2. No");

            try {
                in = new Scanner(System.in);
                select = in.nextInt();

                if (select >= 1 && select <= 2) {
                    endInput = false;
                } else {
                    System.out.println("An ERROR ocured \n");
                    System.out.println("You can choose only 1 or 2 option \n");
                }
            }catch (InputMismatchException e) {
                System.out.println("---IMPOSSIBLE to enter symbols---");
            }
        } while (endInput == true);

        switch (select) {
            case 1:
                System.out.println("Enter number of strings");
                Scanner in1 = new Scanner(System.in);
                this.number = in1.nextInt();
                break;

            case 2:
                this.number = 10;
        }
    }

    public static String getPath() {
        return path;
    }

    public static int getNumber() {
        return number;
    }
}
