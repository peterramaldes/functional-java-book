import java.util.*;
import java.math.*;

public class DiscountFunctional {
  public static void main(String[] args) {
    final List<BigDecimal> prices = Arrays.asList(
        new BigDecimal("10"), new BigDecimal("30"), new BigDecimal("17"),
        new BigDecimal("20"), new BigDecimal("15"), new BigDecimal("18"),
        new BigDecimal("45"), new BigDecimal("12"));

    newWay(prices);
  }

  private static void oldWay(List<BigDecimal> prices) {
    BigDecimal totalOfDiscountedPrices = BigDecimal.ZERO;

    for (BigDecimal price : prices) {
      if (price.compareTo(BigDecimal.valueOf(20)) > 0)
          totalOfDiscountedPrices 
            = totalOfDiscountedPrices.add(price.multiply(BigDecimal.valueOf(0.9)));
    }

    System.out.println("Total of discounted prices: " + totalOfDiscountedPrices);
  }

  private static void newWay(List<BigDecimal> prices) {
    final BigDecimal totalOfDiscountedPrices =
      prices.stream()
        .filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0)
        .map(price -> price.multiply(BigDecimal.valueOf(0.9)))
        .reduce(BigDecimal.ZERO, BigDecimal::add);

    System.out.println("Total of discounted prices: " + totalOfDiscountedPrices);
  }
    
}
