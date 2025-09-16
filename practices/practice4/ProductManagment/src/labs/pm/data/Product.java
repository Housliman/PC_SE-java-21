package labs.pm.data;

import java.math.BigDecimal;

public class Product {
  private int id;
  private String name;
  private BigDecimal price;

  public void setId(int id) {
    this.id = id;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public int getId() {
    return id;
  }
  public String getName() {
    return name;
  }
  public BigDecimal getPrice() {
    return price;
  }
  
}
