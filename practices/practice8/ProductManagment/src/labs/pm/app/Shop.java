package labs.pm.app;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Locale;

import labs.pm.data.*;

public class Shop {
  public static void main(String[] args) {
    ProductManager pm = new ProductManager(Locale.UK);
    Product p1 = pm.createProduct(
        101, 
        "Tea", 
        BigDecimal.valueOf(1.99),
        Rating.NOT_RATED
    );

    pm.printProductReport();

    p1 = pm.reviewProduct(p1, Rating.FIVE_STAR, "Nice hot cup of Tea");
    p1 = pm.reviewProduct(p1, Rating.TWO_STAR, "Rather weak tea");
    p1 = pm.reviewProduct(p1, Rating.FOUR_STAR, "Fine tea");
    p1 = pm.reviewProduct(p1, Rating.FOUR_STAR, "Good tea");
    p1 = pm.reviewProduct(p1, Rating.FIVE_STAR, "Perfect tea");
    p1 = pm.reviewProduct(p1, Rating.THREE_STAR, "Just add some lemon");

    pm.printProductReport();

  }
}

/**
  * for runing this code use this steps:
  ** Go outside of folder src 
  ** run command `javac -d out $(find src -name "*.java")`
  ** And then run `java -cp out labs.pm.app.Shop`
*/
