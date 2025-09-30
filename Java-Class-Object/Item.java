class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Unit: " + price);
    }

    double totalCost(int quantity) {
        return price * quantity;
    }
}

public class ItemMain {
    public static void main(String[] args) {
        Item item = new Item(201, "Laptop", 45000);
        item.displayDetails();
        int quantity = 3;
        System.out.println("Total Cost for " + quantity + " units: " + item.totalCost(quantity));
    }
}
