
import javax.swing.JOptionPane;

public class InvoiceTest {

    public static void item_modification (Invoice item) {

        String user_choice_string;
        int user_choice_nbr,items_purchased;
        double one_item_price;


        user_choice_string = JOptionPane.showInputDialog("Press 1 to modify the item ID\nPress 2 to modify the item's description\nPress 3 to modify the single particle of the item's price\nPress 4 to modify the total particles purchased on the item\nPress any other number to return");
        user_choice_nbr = Integer.parseInt(user_choice_string);

        switch (user_choice_nbr) {

            case 1:

               user_choice_string = JOptionPane.showInputDialog("Old ID of the item is: "+item.getPartNbr()+"\nEnter a new ID for the item: ");
               item.setPartNbr(user_choice_string);
               JOptionPane.showMessageDialog(null,"Item's part number is successfully modified");

            break;

            case 2:

                user_choice_string = JOptionPane.showInputDialog("Old item's description is: "+item.getItemDescription()+"\nEnter a new description for the item: ");
                item.setItemDescription(user_choice_string);
                JOptionPane.showMessageDialog(null,"Item's description is successfully modified");

            break;

            case 3:

                user_choice_string = JOptionPane.showInputDialog("Old single particle of the item's price is: "+item.getOneItemPrice()+"\nEnter a new single particle of the item's price: ");
                one_item_price = Double.parseDouble(user_choice_string);
                item.setOneItemPrice(one_item_price);
                JOptionPane.showMessageDialog(null,"Item's single particle price is successfully modified");

            break;


            case 4:

                user_choice_string = JOptionPane.showInputDialog("Old total particles purchased on the item are: "+item.getItemsPurchased() +"\nEnter new particles purchased on the item: ");
                items_purchased = Integer.parseInt(user_choice_string);
                item.setItemsPurchased(items_purchased);
                JOptionPane.showMessageDialog(null,"Item's particles purchased are successfully modified");

            break;

            default:
                return;
        }
    }

    public static void manipulate_item (Invoice item) {

        String choice_string;
        int choice_number;

        while (true) {
            choice_string = JOptionPane.showInputDialog("Here is your item description\nThe item's ID: "+item.getPartNbr()+"\nThe item's description: "+item.getItemDescription()+"\nThe single particle of the item's price: "+item.getOneItemPrice()+"\nThe total particles purchased on the item: "+item.getItemsPurchased()+"\nThe total price paid: "+item.getTotalPriceSpent()+"\nPress 1 to modify one of the settings and press 0 to quit the program");
            choice_number = Integer.parseInt(choice_string);

            if (choice_number == 0) {
                break;
            }

            switch (choice_number) {
                case 1:
                    InvoiceTest.item_modification(item);
                break;
                default:
                JOptionPane.showMessageDialog(null,"Invalid choice!");
            }
        }
    }


    public static Invoice add_new_item_to_invoice () {

        Invoice item = null;
        String item_part_nbr,item_description,items_purchased_string,one_item_purchase_price_string;
        int items_purchased_int;
        double one_item_purchase_price_double;

        item_part_nbr = JOptionPane.showInputDialog("Enter the item's ID: ");
        item_description = JOptionPane.showInputDialog("Enter the item's description: ");
        items_purchased_string = JOptionPane.showInputDialog("Enter the number of items that the customer has purchased: ");
        one_item_purchase_price_string = JOptionPane.showInputDialog("Enter the price of one single particle on the item: ");

        items_purchased_int = Integer.parseInt(items_purchased_string);
        one_item_purchase_price_double = Double.parseDouble(one_item_purchase_price_string);

        item = new Invoice(item_part_nbr,item_description,one_item_purchase_price_double,items_purchased_int);
        return item;
    }

    public static void main (String[] args) {

        Invoice item;

        String user_choice_string;
        int user_choice_int;

        user_choice_string = JOptionPane.showInputDialog("Welcome to the application\nHere you can add a new item and generate it's invoice.\nPress 1 to add an item");
        user_choice_int = Integer.parseInt(user_choice_string);

        if (user_choice_int == 1) {
            item = InvoiceTest.add_new_item_to_invoice();
            InvoiceTest.manipulate_item(item);
        }
        JOptionPane.showMessageDialog(null,"Thank your for using our application");
    }
}
