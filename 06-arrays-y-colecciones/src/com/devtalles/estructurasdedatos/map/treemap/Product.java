package com.devtalles.estructurasdedatos.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class Product implements Comparable<Product>{
    private int id;
    private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return Integer.compare(this.id, o.id);
    }

    public static void main (String[] args){
        Map<Product, Double> priceMap = new TreeMap<>();

        //Create
        priceMap.put(new Product(191, "Laptop"), 1000.0);
        priceMap.put(new Product(192, "SmartPhone"), 500.0);
        priceMap.put(new Product(193, "Tablet"), 700.0);

        //Read
        System.out.println(priceMap);

        //Update
        priceMap.put(new Product(193, "Tablet"), 5000.0);

        System.out.println(priceMap);

        //Delete
        priceMap.remove(new Product(191, "Laptop"));

        System.out.println(priceMap);

        System.out.println(priceMap.get(new Product(192, "SmartPhone")));
    }
}
