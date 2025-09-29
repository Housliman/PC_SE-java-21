package labs.pm.data;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Objects;

import labs.pm.data.Rateable;
import labs.pm.data.Rating;

public sealed abstract class Product 
  implements Rateable<Product>
  permits Food, Drink {

  private final int id;
  private final String name;
  private final BigDecimal price;
  public final Rating rating;
  public static final BigDecimal DISCOUNT_RATE=BigDecimal.valueOf(0.1);

  Product(int id, String name, BigDecimal price, Rating rating) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.rating = rating;
  }
  // public Product(int id, String name, BigDecimal price) {
  //   this(id, name, price, Rating.NOT_RATED);
  // }
  // public Product() {
  //   this(0, "Unkown", BigDecimal.ZERO);
  // }

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
  public Rating getRating() {
    return rating;
  }

  public LocalDate getBestBefore() {
    return LocalDate.now();
  }

  // public abstract Product applyRating(Rating newRating);

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    // if (obj == null || getClass() != obj.getClass()) return false;
    // Product product = (Product) obj;
    if (obj instanceof Product product)
      return id == product.id && Objects.equals(name, product.name);
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }



  @Override
  public String toString() {
    return id+", "+name+", "+price+", "
      +getDiscount()+", "+rating.getStars()
      +", "+getBestBefore();
  }
}


































