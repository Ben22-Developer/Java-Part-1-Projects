public class Invoice {
    private String part_nbr; //a part nbr is like PIN of an item
    private String item_description;
    private double  unit_price;
    private int quantity_purchased;

    public Invoice (String part_nbr, String item_description, double unit_price, int quantity_purchased) {

        this.part_nbr = part_nbr;
        this.item_description = item_description;
        if (unit_price > 0) {
            this.unit_price = unit_price;
        }
        if (quantity_purchased > 0) {
            this.quantity_purchased = quantity_purchased;
        }
    }

    public void setPartNbr (String part_nbr) {
        this.part_nbr = part_nbr;
    }

    public void setItemDescription (String item_description) {
        this.item_description = item_description;
    }

    public void setOneItemPrice (double unit_price) {
        if (unit_price > 0) {
            this.unit_price = unit_price;
        }
    }

    public void setItemsPurchased (int quantity_purchased) {
        if (quantity_purchased > 0) {
            this.quantity_purchased = quantity_purchased;
        }
    }

    public String getPartNbr () {
        return this.part_nbr;
    }

    public String getItemDescription () {
        return this.item_description;
    }

    public double getOneItemPrice () {
        return this.unit_price;
    }

    public int getItemsPurchased () {
        return  this.quantity_purchased;
    }

    public double getTotalPriceSpent () {
        return  this.unit_price * this.quantity_purchased;
    }
}
