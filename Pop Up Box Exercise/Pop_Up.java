import javax.swing.JOptionPane;
public class Pop_Up {
    public static void main (String[] args) {
        String num1_string,num2_string;
        int num1_nbr,num2_nbr,sum;

        JOptionPane.showMessageDialog(null,"This program is taking numbers from the user and displays their sum");

        num1_string = JOptionPane.showInputDialog("Enter the first number: ");
        num2_string = JOptionPane.showInputDialog("Enter the second number: ");

        num1_nbr = Integer.parseInt(num1_string);
        num2_nbr = Integer.parseInt(num2_string);
        sum = num1_nbr + num2_nbr;

        JOptionPane.showMessageDialog(null,num1_nbr+" + "+num2_nbr+" = "+sum);
    }
}
