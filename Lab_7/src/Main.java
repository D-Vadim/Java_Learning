public class Main {
    public static void main(String[] args) {
        // TopWords.main(new String[]{"hby"});

        /*
        Stack<Integer> stack = new Stack<>(12);
        stack.push(123);
        stack.push(12);
        stack.push(1);
        stack.push(12);
        stack.push(123);

        System.out.println(stack.peek());
        stack.pop();
        stack.push(555);
        stack.push(777);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
         */

        Sales s = new Sales();
        s.inputProduct("t1", 12);
        s.inputProduct("t2", 1);
        s.inputProduct("t1", 21);
        s.inputProduct("t2", 11);
        s.inputProduct("t3", 100);
        s.inputProduct("t4", 14);

        s.displayProducts();
        System.out.println(s.mostPopularProduct());
        System.out.println(s.calculateTotalSales());

    }
}
