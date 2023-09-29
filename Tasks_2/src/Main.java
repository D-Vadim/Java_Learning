import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task #1");
        System.out.println("The word \"Donald\" contains repeated characters? --> "
                + duplicateChars("Donald"));
        System.out.println("The word \"orange\" contains repeated characters? --> "
                + duplicateChars("orange"));
        System.out.println("==========================================================");

        System.out.println("Task #2");
        System.out.println("Ryan Gosling  --> " + getInitials("Ryan Gosling"));
        System.out.println("Barack Obama  --> " + getInitials("Barack Obama"));
        System.out.println("==========================================================");

        System.out.println("Task #3");
        int[] task3_1 = {44, 32, 86, 19};
        int[] task3_2 = {22, 50, 16, 63, 31, 55};
        System.out.println("{44, 32, 86, 19} --> " + differenceEvenOdd(task3_1));
        System.out.println("{22, 50, 16, 63, 31, 55} --> " + differenceEvenOdd(task3_2));
        System.out.println("==========================================================");

        System.out.println("Task #4");
        int[] task4_1 = {1, 2, 3, 4, 5};
        int[] task4_2 = {1, 2, 3, 4, 6};
        System.out.println("There is an element in the array that is equal to avg. all elements of the array? --> "
                + equalToAvg(task4_1));
        System.out.println("There is an element in the array that is equal to avg. all elements of the array? --> "
                + equalToAvg(task4_2));
        System.out.println("==========================================================");

        System.out.println("Task #5");
        int[] task5_1 = {1, 2, 3};
        int[] task5_2 = {3, 3, -2, 408, 3, 31};
        System.out.println("{1, 2, 3} --> " + print(indexMult(task5_1)));
        System.out.println("{3, 3, -2, 408, 3, 31} --> " + print(indexMult(task5_2)));
        System.out.println("==========================================================");

        System.out.println("Task #6");
        System.out.println("\"Hello World\" --> " + reverse("Hello World"));
        System.out.println("\"The quick brown fox.\" --> " + reverse("The quick brown fox."));
        System.out.println("==========================================================");

        System.out.println("Task #7");
        System.out.println("Tribonacci(7)  --> " + tribonacci(7));
        System.out.println("Tribonacci(11) --> " + tribonacci(11));
        System.out.println("==========================================================");

        System.out.println("Task #8");
        System.out.println("HASH with length = 0   --> \"" + pseudoHash(0) + "\"");
        System.out.println("HASH with length = 5   --> \"" + pseudoHash(5) + "\"");
        System.out.println("HASH with length = 10  --> \"" + pseudoHash(10) + "\"");
        System.out.println("==========================================================");

        System.out.println("Task #9");
        System.out.println(botHelper("Hello, I’m under the water, please helper! me"));
        System.out.println(botHelper("Two pepperoni pizzas please"));
        System.out.println("==========================================================");

        System.out.println("Task #10");
        System.out.println("\"listen\" and \"silent\" is anagram?  --> " + isAnagram("listen", "silent"));
        System.out.println("\"eleven plus two\" and \"twelve plus one\" is anagram?  --> "
                + isAnagram("eleven plus two", "twelve plus one"));
        System.out.println("\"hello\" and \"world\" is anagram?  --> " + isAnagram("hello", "world"));
    }


    // Function that determines whether a string contains duplicate characters
    static boolean duplicateChars(String str) {
        char[] string = str.toLowerCase().toCharArray();

        for (int i = 0; i < string.length - 1; ++i) {
            for (int j = i + 1; j < string.length; ++j) {
                if (string[i] == string[j]) {
                    return true;
                }
            }
        }

        return false;
    }


    // Function that returns initials
    static String getInitials(String str) {
        String[] initials = str.toUpperCase().split(" ");

        char firstName = initials[0].charAt(0);
        char secondName = initials[1].charAt(0);

        return firstName + Character.toString(secondName);
    }


    // Function that calculates the difference between the sum of even and odd
    static int differenceEvenOdd(int[] array) {
        int ans = 0;

        for (int i : array) {
            if (i % 2 == 0) {
                ans += i;
            } else {
                ans -= i;
            }
        }

        return Math.abs(ans);
    }


    // Function that checks whether there is an element that is equal to the arithmetic mean of all array elements
    static boolean equalToAvg(int[] array) {
        float avg = (float) Arrays.stream(array).sum() / array.length;

        for (int i : array) {
            if (i == avg) {
                return true;
            }
        }

        return false;
    }


    // Function that multiplies each number in an array by the index of that number
    static int[] indexMult(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= i;
        }

        return array;
    }


    // Function that reverses a string
    static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }


    // Function that returns the Tribonacci number
    static int tribonacci(int n) {
        if (n == 1 || n == 2) {
            return 0;
        } else if (n == 3) {
            return 1;
        }

        return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
    }


    // Function that generates a quasi-hash of user-specified length.
    static String pseudoHash(int len) {
        StringBuilder hash = new StringBuilder();

        for (int i = 0; i < len; ++i) {
            hash.append(Integer.toHexString(new Random().nextInt(16)));
        }

        return hash.toString();
    }


    // Function that finds the word "help" in a given transcript string
    static String botHelper(String mes) {
        String[] str = mes.toLowerCase().split("\\W");

        for (String s: str) {
            if (s.equals("help")) {
                return "Calling for a staff member";
            }
        }

        return "Keep waiting";
    }


    // Function that tests two strings to see if they are anagrams
    static boolean isAnagram(String firstString, String secondString) {
        char[] first = firstString.toCharArray();
        char[] second = secondString.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first, second);
    }


    // Function that prints an array
    static String print(int[] array) {
        StringBuilder ans = new StringBuilder("[");

        for (int i = 0; i < array.length; ++i) {
            ans.append(array[i]);
            if (i != array.length - 1) {
                ans.append(", ");
            }
        }

        ans.append("]");

        return ans.toString();
    }
}