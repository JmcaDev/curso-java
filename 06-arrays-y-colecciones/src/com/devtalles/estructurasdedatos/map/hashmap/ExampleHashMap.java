package com.devtalles.estructurasdedatos.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {
    public static void main(String[] args) {
        Map<String, Integer> productPrices = new HashMap<>();
        productPrices.put("Laptop", 1200);
        productPrices.put("SmartPhone", 2000);
        productPrices.put("Tablet", 2500);
        productPrices.put("Mouse", 500);
        productPrices.put("Keyboard", 800);

        System.out.println(productPrices);

        System.out.println(productPrices.get("Laptop"));

        productPrices.put("Tablet", 3500);

        System.out.println(productPrices);

        productPrices.remove("SmartPhone");

        System.out.println(productPrices);
    }
}
