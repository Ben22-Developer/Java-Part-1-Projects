import javax.swing.JOptionPane;

public class HealthProfileController {

    static HealthProfile user = null;

    public static void handle_null_user_error () {
        JOptionPane.showMessageDialog(null,"Sorry there is no user currently");
    }

    public static  void modify_user_details () {
        if (user == null) {
            handle_null_user_error();
            return;
        }

        String user_choice_string;
        int user_choice_int;

        String user_name,user_gender_string,user_birth_year_string,user_birth_month_string,user_birth_day_string,user_height_string,user_weight_string;
        char user_gender_char;
        int user_birth_year_int,user_birth_month_int,user_birth_day_int;
        double user_height_double, user_weight_double;

        user_choice_string = JOptionPane.showInputDialog("Press 1 to modify the user's name\nPress 2 to modify the user's gender\nPress 3 to modify the user's birth year\nPress 4 to modify the user's birth month\nPress 5 to modify the user's birth day\nPress 6 to modify the user's height\nPress 7 to modify the user's weight");

        if (user_choice_string == null) {
            return;
        }

        user_choice_int = Integer.parseInt(user_choice_string);

        switch (user_choice_int) {

            case 1:
                user_name = JOptionPane.showInputDialog("\nOld user's name: "+user.getUser_name()+"\nEnter new user name: ");
                if (user_name != null) {
                    user.setUser_name(user_name);
                    JOptionPane.showMessageDialog(null,"User name is successfully updated");
                }
            break;
            case 2:
                user_gender_string = JOptionPane.showInputDialog("\nOld user's gender: "+user.getUser_gender()+"\nEnter new user gender: ");
                if (user_gender_string != null) {
                    user_gender_char = user_gender_string.charAt(0);
                    user.setUser_gender(user_gender_char);
                    JOptionPane.showMessageDialog(null,"User gender is successfully updated");
                }
            break;
            case 3:
                user_birth_year_string = JOptionPane.showInputDialog("\nOld user birth year: "+user.getUser_birth_year()+"\nEnter new user birth year: ");
                if (user_birth_year_string != null) {
                    user_birth_year_int = Integer.parseInt(user_birth_year_string);
                    user.setUser_birth_year(user_birth_year_int);
                    JOptionPane.showMessageDialog(null,"User birth year is successfully updated");
                }
            break;
            case 4:
                user_birth_month_string = JOptionPane.showInputDialog("\nOld user birth month: "+user.getUser_birth_month()+"\nEnter new user birth month: ");
                if (user_birth_month_string != null) {
                    user_birth_month_int = Integer.parseInt(user_birth_month_string);
                    user.setUser_birth_month(user_birth_month_int);
                    JOptionPane.showMessageDialog(null,"User birth month is successfully updated");
                }
            break;
            case 5:
                user_birth_day_string = JOptionPane.showInputDialog("\nOld user birth day: "+user.getUser_birth_day()+"\nEnter new user birth day: ");
                if (user_birth_day_string != null) {
                    user_birth_day_int = Integer.parseInt(user_birth_day_string);
                    user.setUser_birth_day(user_birth_day_int);
                    JOptionPane.showMessageDialog(null,"User birth day is successfully updated");
                }
            break;
            case 6:
                user_height_string = JOptionPane.showInputDialog("\nOld user height: "+user.getUser_height()+"\nEnter new user height: ");
                if (user_height_string != null) {
                    user_height_double = Double.parseDouble(user_height_string);
                    user.setUser_height(user_height_double);
                    JOptionPane.showMessageDialog(null,"User height is successfully updated");
                }
            break;
            case 7:
                user_weight_string = JOptionPane.showInputDialog("\nOld user weight: "+user.getUser_weight()+"\nEnter new user weight: ");
                if (user_weight_string != null) {
                    user_weight_double = Double.parseDouble(user_weight_string);
                    user.setUser_weight(user_weight_double);
                    JOptionPane.showMessageDialog(null,"User weight is successfully updated");
                }
            break;
            default:
                JOptionPane.showMessageDialog(null,"Invalid Input");
        }


    }

    public static void view_user_details () {
        if (user == null) {
            HealthProfileController.handle_null_user_error();
            return;
        }
        JOptionPane.showMessageDialog(null,"User's name: "+user.getUser_name()+"\nUser's birth date: "+user.getUser_birth_date()+"\nUser's age: "+user.getUser_age()+"\nUser's gender: "+user.getUser_gender()+"\nUser's height: "+ user.getUser_height()+"\nUser's weight: "+ user.getUser_weight()+"\nUser's maximum heart beat: "+ user.getMaximum_heart_rate()+"\nUser's target heart beat: "+user.getTarget_heart_rate()+"\nUser's body mass index: "+user.getUser_body_mass());
    }

    public static void insert_user () {

        String user_name,user_gender_string,user_birth_year_string,user_birth_month_string,user_birth_day_string,user_height_string,user_weight_string;
        char user_gender_char;
        int user_birth_year_int,user_birth_month_int,user_birth_day_int;
        double user_height_double, user_weight_double;

        user_name = JOptionPane.showInputDialog("Enter the user's name: ");
        user_gender_string = JOptionPane.showInputDialog("Enter the user's gender: ");
        user_birth_year_string = JOptionPane.showInputDialog("Enter the user's birth year: ");
        user_birth_month_string = JOptionPane.showInputDialog("Enter the user's birth month:");
        user_birth_day_string = JOptionPane.showInputDialog("Enter the user's birth day:");
        user_height_string = JOptionPane.showInputDialog("Enter the user's height:");
        user_weight_string = JOptionPane.showInputDialog("Enter the user's weight:");

        user_gender_char = user_gender_string.charAt(0);

        user_birth_year_int = Integer.parseInt(user_birth_year_string);
        user_birth_month_int = Integer.parseInt(user_birth_month_string);
        user_birth_day_int = Integer.parseInt(user_birth_day_string);

        user_height_double = Double.parseDouble(user_height_string);
        user_weight_double = Double.parseDouble(user_weight_string);

        user = new HealthProfile(user_name, user_gender_char, user_birth_year_int, user_birth_month_int, user_birth_day_int, user_height_double, user_weight_double);

        JOptionPane.showMessageDialog(null,"New user is successfully created");
    }

    public static void user_profile_manipulation () {

        int choice_int = 1;
        String choice_string;

        do {
            choice_string = JOptionPane.showInputDialog("Press 1 to make a new user object\nPress 2 to view the user's details\nPress 3 to modify the user's details\nPress 0 to end the program");
            choice_int = Integer.parseInt(choice_string);

            switch (choice_int) {
                case 1:
                    insert_user();
                break;
                case 2:
                    view_user_details();
                break;
                case 3:
                    modify_user_details();
                break;
            }

        }
        while (choice_int != 0);
    }
}
