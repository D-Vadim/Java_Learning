public class Main {
    public static void main(String[] args) {
/*
        HashTable<Integer, String> ht1 = new HashTable<>(10);

        ht1.put(1, "Hello, ");
        ht1.put(3, "World");
        ht1.put(4, "!");
        ht1.put(11, "extra mes");
        ht1.put(12, "HI");

        System.out.println(ht1.get(1));
        System.out.println(ht1.get(11));
        System.out.println(ht1.get(111));
        System.out.println("Size = " + ht1.size());

        ht1.put(1, "Hell0");
        ht1.remove(12);
        ht1.remove(11);

        System.out.println(ht1.get(1));
        System.out.println(ht1.get(11));
        System.out.println(ht1.get(4));
        System.out.println(ht1.get(12));
        System.out.println("Size = " + ht1.size());
*/

        HashTable<Integer, Product> products = new HashTable<>(10);

        Product banana = new Product("banana", 20, 55);
        Product apple = new Product("apple", 60, 20);
        Product orange = new Product("orange", 30, 30);

        products.put(124893, banana);
        products.put(123456, apple);
        products.put(7654285, orange);

        System.out.println(products.get(123456).getName() + ": " + products.get(123456).getPrice() + " руб.");
        System.out.println(products.get(124893).getName() + ": " + products.get(124893).getPrice() + " руб.");
        System.out.println(products.get(7654285).getName() + ": " + products.get(7654285).getPrice() + " руб.");

        products.remove(123456);

        // System.out.println(products.get(123456).getName() + ": " + products.get(123456).getPrice() + " руб.");
    }
}