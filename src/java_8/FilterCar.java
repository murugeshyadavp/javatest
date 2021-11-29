package java_8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterCar {

    public static void main(String args[]){

        List<String> list = Stream.of("eco","f250","abc","nano","f150","rhyno").collect(Collectors.toList());

        // ourput = F150, F250

        list.stream().filter(vehicle -> vehicle.startsWith("f"))
                     .sorted()
                     .map(String::toUpperCase)
                     .forEach(vehicle -> System.out.println(vehicle));

    }

}
