import javax.swing.JOptionPane;

public class Main {
    public static void main (String[] args) {

        String welcome_message = "Welcome to our application\nPress enter and get started";
        String goodbye_message = "Thank you for using our application! ";

        JOptionPane.showMessageDialog(null,welcome_message);

        HealthProfileController.user_profile_manipulation();

        JOptionPane.showMessageDialog(null,goodbye_message);
    }
}
