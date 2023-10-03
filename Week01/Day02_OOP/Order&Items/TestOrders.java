import java.util.ArrayList;

public class TestOrders {

    public static void main(String[] args) {
    Item item1 = new Item();
    Item item2 = new Item();
    Item item3 = new Item();
    Item item4 = new Item();
    // Menu items
    item1.name = "mocha";
    item1.price = 4.5;

    item2.name = "latte";
    item2.price = 3.2;

    item3.name = "drip coffee";
    item3.price = 6;

    item4.name = "capuccino";
    item4.price = 2;

    // Order variables -- order1, order2 etc.
    Order order1 = new Order();
    Order order2 = new Order();
    Order order3 = new Order();
    Order order4 = new Order();
    
    order1.name = "Cindhuri";
    order2.name = "Jimmy";
    order3.name = "Noah";
    order4.name = "Sam";

    order2.items = new ArrayList<Item>();
    order2.items.add(item1);

    order3.items = new ArrayList<Item>();
    order3.items.add(item4);

    order4.items = new ArrayList<Item>();
    order4.items.add(item2);
    order4.items.add(item2);
    
    order1.ready = true;
    order2.ready = true;





    // Application Simulations
    // Use this example code to test various orders' updates
    // System.out.printf("Name: %s\n", order1.name);
    // System.out.printf("Total: %s\n", order1.total);
    // System.out.printf("Ready: %s\n", order1.ready);
    
    System.out.printf("Name: %s\n", order2.name);
    System.out.printf("Ready: %s\n", order2.ready);
    for(var i =0 ; i<order2.items.size();i++)
    {
        System.out.printf("items ordered: %s\n", order2.items.get(i).name);
        System.out.printf("items price: %s\n", order2.items.get(i).price);
        order2.total += order2.items.get(i).price;
    }
    System.out.printf("Total: %s\n", order2.total);
    

    System.out.printf("Name: %s\n", order3.name);
    System.out.printf("Ready: %s\n", order3.ready);
    for(var i =0 ; i<order3.items.size();i++)
    {
        System.out.printf("items ordered: %s\n", order3.items.get(i).name);
        System.out.printf("items price: %s\n", order3.items.get(i).price);
        order3.total += order3.items.get(i).price;
    }
    System.out.printf("Total: %s\n", order3.total);
    }
}
