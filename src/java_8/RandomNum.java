package java_8;

import java.util.Random;
import java.util.stream.Stream;

public class RandomNum {

    public static void main(String args[]){

        Stream.generate(() -> new Random().nextInt(20))
              .limit(5)
              .forEach(System.out::println);

    }
}
