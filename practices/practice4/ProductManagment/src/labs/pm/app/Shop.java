package labs.pm.app;

import java.math.BigDecimal;

import labs.pm.data.Condition;
import labs.pm.data.Product;

public class Shop {
  public static void main(String[] args) {
    Product p1 = new Product(101, "Coffee", BigDecimal.valueOf(1.99), Condition.HOT);
    System.out.println(p1.serve());
    // p1.setId(101);
    // p1.setName("Tea");
    // p1.setPrice(BigDecimal.valueOf(1.99));

    // System.out.println(p1.getId()+" "+p1.getName()+" "+p1.getPrice()+" "+p1.getDiscount());
  }
}

/**
  * for runing this code use this steps:
  ** Go outside of folder src 
  ** run command `javac -d out $(find src -name "*.java")`
  ** And then run `java -cp out labs.pm.app.Shop`
*/
