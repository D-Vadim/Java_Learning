import java.util.HashMap;

public class Sales {
    private HashMap<String, Integer> sales;

    public Sales() {
        sales = new HashMap<>();
    }
    public void inputProduct(String name, int quantity) {
        if (sales.containsKey(name)) {
            sales.put(name, sales.get(name) + quantity);
        } else {
            sales.put(name, quantity);
        }
    }
    public void displayProducts() {
        for (String product : sales.keySet()) {
            System.out.println(product + " --> " + sales.get(product));
        }
    }
    public int calculateTotalSales() {
        int totalSales = 0;
        for (Integer count : sales.values()) {
            totalSales += count;
        }
        return totalSales;
    }
    public String mostPopularProduct() {
        int maxSales = 0;
        String answer = null;

        for (String product: sales.keySet()) {
            if (maxSales < sales.get(product)) {
                maxSales = sales.get(product);
                answer = product;
            }
        }

        return answer;
    }
}
