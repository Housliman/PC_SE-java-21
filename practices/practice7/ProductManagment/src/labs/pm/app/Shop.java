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
        BigDecimal.valueOf(1.49),
        Rating.NOT_RATED,
        LocalDate.now()
    );

    pm.printProductReport();

    p1 = pm.reviewProduct(p1, Rating.FIVE_STAR, "Nice hot cup of Tea");

    pm.printProductReport();

  }
}

/**
  * for runing this code use this steps:
  ** Go outside of folder src 
  ** run command `javac -d out $(find src -name "*.java")`
  ** And then run `java -cp out labs.pm.app.Shop`
*/
