public class Main {
    public static void main(String[] args) {
        System.out.println("Task #1");
        System.out.println("Convert 5 gallons to liters: " + convert(5) + " l");
        System.out.println("Convert 3 gallons to liters: " + convert(3) + " l");
        System.out.println("Convert 8 gallons to liters: " + convert(8) + " l");
        System.out.println("==========================================================");

        System.out.println("Task #2");
        System.out.println(fitCalc(15, 1) + " calories");
        System.out.println(fitCalc(24, 2) + " calories");
        System.out.println(fitCalc(41, 3) + " calories");
        System.out.println("==========================================================");

        System.out.println("Task #3");
        System.out.println(containers(3, 4, 2) + " products");
        System.out.println(containers(5, 0, 2) + " products");
        System.out.println(containers(4, 1, 4) + " products");
        System.out.println("==========================================================");

        System.out.println("Task #4");
        System.out.println("The type of triangle with sides 5, 5, 5 : " + triangleType(5, 5, 5));
        System.out.println("The type of triangle with sides 5, 4, 5 : " + triangleType(5, 4, 5));
        System.out.println("The type of triangle with sides 3, 4, 5 : " + triangleType(3, 4, 5));
        System.out.println("The type of triangle with sides 5, 1, 1 : " + triangleType(5, 1, 1));
        System.out.println("==========================================================");

        System.out.println("Task #5");
        System.out.println("The larger number is " + ternaryEvaluation(8, 4));
        System.out.println("The larger number is " + ternaryEvaluation(1, 11));
        System.out.println("The larger number is " + ternaryEvaluation(5, 9));
        System.out.println("==========================================================");

        System.out.println("Task #6");
        System.out.println(howManyItems(22, 1.4, 2) + " Items");
        System.out.println(howManyItems(45, 1.8, 1.9) + " Items");
        System.out.println(howManyItems(100, 2, 2) + " Items");
        System.out.println("==========================================================");

        System.out.println("Task #7");
        System.out.println("Factorial of 3 = " + factorial(3));
        System.out.println("Factorial of 5 = " + factorial(5));
        System.out.println("Factorial of 7 = " + factorial(7));
        System.out.println("==========================================================");

        System.out.println("Task #8");
        System.out.println("The GCD of two numbers: " + gcd(48, 18));
        System.out.println("The GCD of two numbers: " + gcd(52, 8));
        System.out.println("The GCD of two numbers: " + gcd(259, 28));
        System.out.println("==========================================================");

        System.out.println("Task #9");
        System.out.println("The total revenue from ticket sales: " + ticketSaler(70, 1500));
        System.out.println("The total revenue from ticket sales: " + ticketSaler(24, 950));
        System.out.println("The total revenue from ticket sales: " + ticketSaler(53, 1250));
        System.out.println("==========================================================");

        System.out.println("Task #10");
        System.out.println(tables(5, 2) + " tables are missing to accommodate all the students");
        System.out.println(tables(31, 20) + " tables are missing to accommodate all the students");
        System.out.println(tables(123, 58) + " tables are missing to accommodate all the students");
        System.out.println("==========================================================");
    }

    // Convert gallons to liters
    static double convert(int gallons) {
        return gallons * 3.785;
    }

    // Calculate the number of calories burned based on time and intensity
    static int fitCalc(int minutes, int intensity) {
        return minutes * intensity;
    }

    // Return the total quantity of items
    static int containers(int boxes, int bags, int barrels) {
        return boxes * 20 + bags * 50 + barrels * 100;
    }

    // Return the type of triangle based on the given sides
    static String triangleType(int a, int b, int c) {
        if (a == b && b == c) {
            return "isosceles";
        } else if (a + b < c || a + c < b || b + c < a) {
            return "not a triangle";
        } else if (a == b || b == c || a == c){
            return "equilateral";
        } else {
            return "different-sided";
        }
    }

    // Return the larger number
    static int ternaryEvaluation(int a, int b) {
        return a > b ? a : b;
    }

    // Return number of items
    static int howManyItems(int n, double width, double length) {
        return (int) ((n * 2) / (width * length));
    }

    // Calculates the factorial of a selected number
    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Finds the greatest common divisor of two numbers
    static int gcd(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        return a + b;
    }

    // Return the total revenue from ticket sales
    static double ticketSaler(int tickets, int cost) {
        return tickets * cost * 0.72;
    }

    // Determine how many tables are missing to accommodate all the students
    static int tables(int students, int desks) {
        if (desks * 2 >= students) {
            return 0;
        }
        return (students - 2 * desks) / 2 + students % 2;
    }
}
