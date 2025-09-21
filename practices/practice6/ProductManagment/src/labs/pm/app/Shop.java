package labs.pm.app;

import java.math.BigDecimal;
import java.time.LocalDate;

import labs.pm.data.*;

public class Shop {
  public static void main(String[] args) {
    ProductManager pm = new ProductManager();
    Product p1 = pm.createProduct(
        101, 
        "Tea", 
        BigDecimal.valueOf(1.49),
        Rating.NOT_RATED
    );

    pm.printProductReport();

    p1 = pm.reviewProduct(p1, Rating.FIVE_STAR, "Nice hot cup of Tea");

    pm.printProductReport();

    // Product p2 = pm.createProduct(
    //     102, 
    //     "Coffee", 
    //     BigDecimal.valueOf(1.99), 
    //     Rating.FOUR_STAR
    // );
    //
    // Product p3 = pm.createProduct(
    //     103, 
    //     "Cake", 
    //     BigDecimal.valueOf(3.99), 
    //     Rating.FIVE_STAR,
    //     LocalDate.now().plusDays(2)
    // );
    //
    // Product p4 = pm.createProduct(
    //     105,
    //     "Cookie",
    //     BigDecimal.valueOf(3.99),
    //     Rating.TWO_STAR,
    //     LocalDate.now()
    // );
    //
    // Product p5 = p3.applyRating(Rating.THREE_STAR);
    // Product p8 = p4.applyRating(Rating.FIVE_STAR);
    // Product p9 = p1.applyRating(Rating.TWO_STAR);
    //
    // System.out.println(p1);
    // System.out.println(p2);
    // System.out.println(p3);
    // System.out.println(p4);
    // System.out.println(p5);
    // System.out.println(p8);
    // System.out.println(p9);
    //
    // Product p6 = pm.createProduct(
    //     104,
    //     "Chocolate",
    //     BigDecimal.valueOf(2.99),
    //     Rating.FIVE_STAR
    //     );
    //
    // Product p7 = pm.createProduct(
    //     104,
    //     "Chocolate",
    //     BigDecimal.valueOf(2.99),
    //     Rating.FIVE_STAR,
    //     LocalDate.now().plusDays(2)
    //     );
    //
    // System.out.println(p6);
    // System.out.println(p7);
    // System.out.println(p6.equals(p7));
    // System.out.println(p3.getBestBefore());
    // System.out.println(p1.getBestBefore());
  }
}

/**
  * for runing this code use this steps:
  ** Go outside of folder src 
  ** run command `javac -d out $(find src -name "*.java")`
  ** And then run `java -cp out labs.pm.app.Shop`
*/
