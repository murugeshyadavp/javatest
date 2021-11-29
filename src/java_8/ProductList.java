package java_8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductList {

    public static void main(String args[]) {

        List<Product> productsList = new ArrayList<Product>(); //Adding Products

        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        List<Float> productPriceList2 = productsList.stream()
                                                    .filter(p -> p.price > 30000)// filtering data
                                                    .map(p -> p.price)        // fetching price
                                                    .collect(Collectors.toList()); // collecting as list

        System.out.println(productPriceList2);

        productsList.stream()
                    .filter(p ->p.price >30000)// filtering data
                    .map(Product::getPrice) // mapping only price
                    .forEach(System.out::println);
    }
}

class Product{

    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public float getPrice(){
        return this.price;
    }
}