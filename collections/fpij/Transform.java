import java.util.*;
import java.util.function.*;

public class Transform {
  public static void main(String[] args) {
    final List<String> friends = 
      Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
    final List<String> namesUpperCase = new ArrayList<>();

    friends.stream()
      .map(String::toUpperCase)
      .forEach(System.out::println);
  }
}

