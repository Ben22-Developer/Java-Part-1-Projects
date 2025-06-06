import java.util.Scanner;

public class TargetHeartRateTest {

    public static TargetHeartRate create_an_object () {

        TargetHeartRate object = null;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your day of birth: ");
        int day = input.nextInt();

        System.out.print("Enter your month of birth: ");
        int month = input.nextInt();

        System.out.print("Enter your year of birth: ");
        int year = input.nextInt();

        object = new TargetHeartRate(name,day,month,year);

        return object;
    }

    public static void main (String[] args) {

        Scanner input = new Scanner (System.in);

        TargetHeartRate user = null;

        int user_choice = 1;

        do {
            System.out.println("\nHey welcome to the application\nPress 1 to create a new person\nPress 2 to get the person's name\nPress 3 to get the person's date of birth\nPress 4 to get the person's age\nPress 5 to get the person's maximum heart beat\nPress 6 to get the person's normal heart beat( not sure tho! this was just for practice )\nPress 0 to end the program");
            System.out.print("\nEnter your choice: ");
            user_choice = input.nextInt();

            switch (user_choice) {
                case 1:
                    user = TargetHeartRateTest.create_an_object();
                break;
                case 2:
                    System.out.println(user.get_name());
                break;
                case 3:
                    System.out.println(user.get_date_of_birth());
                break;
                case 4:
                    System.out.println(user.get_user_age());
                break;
                case 5:
                    System.out.println(user.maximum_heart_beat());
                break;
                case 6:
                    System.out.println(user.target_heart_rate_range());
                break;
            }
        }
        while (user_choice != 0);
    }
}
