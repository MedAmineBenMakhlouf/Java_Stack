public class Item {

  private String name;
  private double price;

  public Item()
  {
    this.name = "";
    this.price = 0;
  }
  public Item(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String newName) {
    this.name = newName;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double newPrice) {
    this.price = newPrice;
  }
}
