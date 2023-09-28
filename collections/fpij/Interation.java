import java.util.*;
import java.util.function.*;

public class Interation {
  public static void main(String[] args) {
    final List<String> friends = 
      Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
    
    friends.forEach(System.out::println);
  }
}

