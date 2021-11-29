package java_8;

import java.util.*;
import java.util.stream.Collectors;

public class MapStream {

    public static void main(String args[]){

        Map<String, String> map = new HashMap<String, String>();

        map.put("1","ONE");
        map.put("4","TWO");
        map.put("2","TWO");
        map.put("3","THREE");

        map.keySet().stream().forEach(key -> System.out.println(key));
        System.out.println();

        map.values().stream().forEach(System.out::println);
        System.out.println();

        map.entrySet().forEach(System.out::println);
        System.out.println();

        map.forEach((k, v) -> System.out.println(("Key="+k + " Value="+v)));
        System.out.println();

        map.entrySet().stream()
                      .forEach(e -> System.out.println("Key="+e.getKey() + " Value=" + e.getValue()));

        Optional op = map.entrySet().stream()
                                    .filter(e -> "TWO".equals(e.getValue()))
                                    .map(Map.Entry::getKey)
                                    .findFirst();

        System.out.println(op.toString());
    }


}

