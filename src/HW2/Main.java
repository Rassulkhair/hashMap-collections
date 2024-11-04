package HW2;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> sales1 = new HashMap<>();
        sales1.put("Товар A", 10);
        sales1.put("Товар B", 5);
        sales1.put("Товар C", 8);

        HashMap<String, Integer> sales2 = new HashMap<>();
        sales2.put("Товар B", 3);
        sales2.put("Товар D", 7);
        sales2.put("Товар E", 2);

        HashMap<String, Integer> totalSales = new HashMap<>();

        for (String product : sales1.keySet()) {
            totalSales.put(product, sales1.get(product));
        }

        for (String product : sales2.keySet()) {
            totalSales.put(product, totalSales.getOrDefault(product, 0) + sales2.get(product));
        }

        System.out.println("Общая статистика продаж: " + totalSales);
    }
}
