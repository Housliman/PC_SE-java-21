package labs.pm.data;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {
  private int id;
  private String name;
  private BigDecimal price;
  public static final BigDecimal DISCOUNT_RATE=BigDecimal.valueOf(0.1);

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
