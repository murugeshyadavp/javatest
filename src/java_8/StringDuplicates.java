package java_8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringDuplicates {

    public static void main(String args[]){

        String value = "perficient";  // duplicates

        Map<Character,Integer> map = new HashMap<Character,Integer>();

        for(int i=0;i<value.length();i++) {

            char charValue = value.charAt(i);

            if(map.containsKey(charValue)) {
                int count = Integer.parseInt(map.get(charValue).toString());
                map.put(charValue,count+1);
            }else
                map.put(charValue,1);
        }

        Arrays.asList(value.toCharArray())
              .stream()
              .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
              .entrySet()
              .stream()
              .forEach((umap) -> System.out.println(umap.getKey()+":"+umap.getValue()));


        map.entrySet().stream()
                      .filter(pmap -> pmap.getValue() > 1)
                      .forEach(System.out::println);



    }
}
