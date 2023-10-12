import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class MenuItem {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private String customerName;
    private Queue<MenuItem> itemsToPrepare;
    private Stack<MenuItem> preparedItems;

    public Order(String customerName) {
        this.customerName = customerName;
        this.itemsToPrepare = new LinkedList<>();
        this.preparedItems = new Stack<>();
    }

    public void addItem(MenuItem item) {
        itemsToPrepare.offer(item);
    }

    public void prepareNextItem() {
        if (!itemsToPrepare.isEmpty()) {
            MenuItem nextItem = itemsToPrepare.poll();
            preparedItems.push(nextItem);
        }
    }

    public void displayOrder() {
        System.out.println("Customer: " + customerName);
        System.out.println("Items to prepare:");
        for (MenuItem item : itemsToPrepare) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Prepared items:");
        for (MenuItem item : preparedItems) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
    }
}

public class RestaurantOrderManagement {
    public static void main(String[] args) {
        LinkedList<MenuItem> menu = new LinkedList<>();
        menu.add(new MenuItem("Burger", 7.99));
        menu.add(new MenuItem("Pizza", 12.99));
        menu.add(new MenuItem("Salad", 5.99));

        Order order1 = new Order("John");
        order1.addItem(menu.get(0));
        order1.addItem(menu.get(1));

        Order order2 = new Order("Jane");
        order2.addItem(menu.get(2));

        order1.prepareNextItem();
        order2.prepareNextItem();
        order1.prepareNextItem();

        order1.displayOrder();
        order2.displayOrder();
    }
}
