package labs.pm.data;

import java.math.BigDecimal;
import java.math.RoundingMode;

import labs.pm.data.Condition;

public class Product {
  private int id;
  private String name;
  private BigDecimal price;
  public Condition condition;
  public static final BigDecimal DISCOUNT_RATE=BigDecimal.valueOf(0.1);

  public Product(int id, String name, BigDecimal price, Condition condition) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.condition = condition;
  }

  public String serve() {
    return switch(condition) {
      case Condition.COLD -> "It is cold";
      case Condition.WARM -> "It is warm";
      case Condition.HOT -> "It is hot";
      // default -> "Unkown";
    };
  }

  public void setId(final int id) {
    this.id = id;
  }
  public void setName(final String name) {
    this.name = name;
  }
  public void setPrice(final BigDecimal price) {
    // price = BigDecimal.ONE;
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

  public BigDecimal getDiscount() {
    return price.multiply(DISCOUNT_RATE).setScale(2, RoundingMode.HALF_UP);
  }
  
}
