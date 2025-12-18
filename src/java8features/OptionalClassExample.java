package java8features;

import java.util.Optional;

public class OptionalClassExample {
    public static void main(String[] args) {
      
    	Optional<String> name = Optional.ofNullable("John");
        name.ifPresent(n -> System.out.println("Name: " + n));

        Optional<String> empty = Optional.empty();
        System.out.println("Is present: " + empty.isPresent());
    }
}
