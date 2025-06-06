import java.util.Scanner;

public class DateTest {

    public static void main (String[] arg) {

        Scanner input = new Scanner(System.in);
        Date date_obj;
        int choice = 1;

        do {

            System.out.print("Enter the day: ");
            int day = input.nextInt();

            System.out.print("Enter the month: ");
            int month = input.nextInt();

            System.out.print("Enter the year: ");
            int year = input.nextInt();

            System.out.println();

            date_obj = new Date(day,month,year);

            System.out.println(date_obj.displayDate());

            System.out.println();

            System.out.print("Press any number to continue or 0 to stop the program: ");
            choice = input.nextInt();
        }
        while (choice != 0);
    }
}
