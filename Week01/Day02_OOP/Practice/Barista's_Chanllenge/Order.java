import java.util.ArrayList;

public class Order {

  private String name;
  private boolean ready;
  private ArrayList<Item> items = new ArrayList<Item>();

  public Order() {
    this.name = "Guest";
    this.ready = false;
    this.items = new ArrayList<>();
  }
  public Order(String name)
  {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String newName) {
    this.name = newName;
  }

  public boolean getReady() {
    return this.ready;
  }

  public void setReady(boolean newStatus) {
    this.ready = newStatus;
  }

  public ArrayList<Item> getItems() {
    return this.items;
  }

  public void setItems(ArrayList<Item> newItems) { 
    this.items = newItems;
  }

  public void addItem(Item item)
  {
    items.add(item);
  }
  public String getStatusMessage()
  {
    String msg="";
    if (this.ready){
      msg = "Your order is ready.";
    }
    else{
      msg = "Thank you for waiting. Your order will be ready soon.";
    }
    return msg;
  }

  public double getOrderTotal()
  {
    double sum = 0;
    for(Item item : items)
    {
      sum+=item.getPrice();
    }
    return sum;
  }

  public void display()
  {
    System.out.println("Customer Name:"+ this.getName());
    for(Item item : items)
    {
      System.out.println(item.getName()+"--"+item.getPrice());
    }
    System.out.println("total price"+getOrderTotal());

  }

}
