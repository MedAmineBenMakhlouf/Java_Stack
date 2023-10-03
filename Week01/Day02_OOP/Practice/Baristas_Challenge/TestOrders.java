import java.util.ArrayList;

public class TestOrders {

    public static void main(String[] args) {

    Item item1 = new Item("mocha", 5.2);
    Item item2 = new Item("latte", 3.25);
    Item item3 = new Item("capuccino", 6);
    Item item4 = new Item("drip coffee", 3);
    
    Order order1 = new Order();
    Order order2 = new Order();

    Order orderWithName1 = new Order("Amine");
    Order orderWithName2 = new Order("Sadok");

    order1.addItem(item1);
    order1.addItem(item4);
    
    order2.addItem(item2);
    order2.addItem(item4);
    
    orderWithName1.addItem(item1);
    orderWithName1.addItem(item2);
    
    orderWithName2.addItem(item1);
    orderWithName2.addItem(item3);

    orderWithName1.setReady(true);
    System.out.println(orderWithName1.getStatusMessage());
    // order1.display();
    
    System.out.println(orderWithName2.getOrderTotal());
    System.out.println("--------------------");
    order1.display();
    System.out.println("--------------------");
    order2.display();
    System.out.println("--------------------");
    orderWithName1.display();
    System.out.println("--------------------");
    orderWithName2.display();


    }

    
}
