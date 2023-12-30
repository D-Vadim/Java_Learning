import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task #1");
        System.out.println("  --> " +
                hiddenAnagram("My world evolves in a beautiful space called Tesh.", "sworn love lived"));
        System.out.println("  --> " + hiddenAnagram("An old west action hero actor", "Clint Eastwood"));
        System.out.println("  --> " + hiddenAnagram("Mr. Mojo Rising could be a song title", "Jim Morrison"));
        System.out.println("  --> " + hiddenAnagram("Banana? margaritas", "ANAGRAM"));
        System.out.println("  --> " + hiddenAnagram("D  e b90it->?$ (c)a r...d,,#~", "bad credit"));
        System.out.println("  --> " + hiddenAnagram("Bright is the moon", "Bongo mirth"));
        System.out.println("==========================================================");

        System.out.println("Task #2");
        String[] out = collect("intercontinentalisationalism", 6);
        System.out.println("  --> " + Arrays.toString(out));
        out = collect("strengths", 3);
        System.out.println("  --> " + Arrays.toString(out));
        out = collect("pneumonoultramicroscopicsilicovolcanoconiosis", 15);
        System.out.println("  --> " + Arrays.toString(out));
        System.out.println("==========================================================");

        System.out.println("Task #3");
        System.out.println("  --> " + pass());
        System.out.println("  --> " + pass());
        System.out.println("  --> " + pass());
        System.out.println("==========================================================");

        System.out.println("Task #4");
        System.out.println("  --> " +
                Arrays.toString(twoProduct(new int[]{1, 2, 3, 9, 4, 5, 15}, 45)));
        System.out.println("  --> " +
                Arrays.toString(twoProduct(new int[]{1, 2, 3, 9, 4, 15, 3, 5}, 45)));
        System.out.println("  --> " +
                Arrays.toString(twoProduct(new int[]{1,  2, -1,  4,  5,  6,  10, 7}, 20)));
        System.out.println("  --> " +
                Arrays.toString(twoProduct(new int[]{1, 2, 3, 4, 5,  6, 7, 8, 9, 10}, 10)));
        System.out.println("  --> " +
                Arrays.toString(twoProduct(new int[]{100, 12, 4, 1, 2}, 15)));
        System.out.println("==========================================================");

        System.out.println("Task #5");
        System.out.println("  --> " + Arrays.toString(isExact(6)));
        System.out.println("  --> " + Arrays.toString(isExact(24)));
        System.out.println("  --> " + Arrays.toString(isExact(125)));
        System.out.println("  --> " + Arrays.toString(isExact(720)));
        System.out.println("  --> " + Arrays.toString(isExact(1024)));
        System.out.println("  --> " + Arrays.toString(isExact(40320)));
        System.out.println("==========================================================");
/*
        System.out.println("Task #6");
        System.out.println("  --> " + pass());
        System.out.println("  --> " + pass());
        System.out.println("  --> " + pass());
        System.out.println("==========================================================");
/*
        System.out.println("Task #7");
        System.out.println("  --> " + pass());
        System.out.println("  --> " + pass());
        System.out.println("  --> " + pass());
        System.out.println("==========================================================");
/*
        System.out.println("Task #8");
        System.out.println("  --> " + pass());
        System.out.println("  --> " + pass());
        System.out.println("  --> " + pass());
        System.out.println("==========================================================");
/*
        System.out.println("Task #9");
        System.out.println("  --> " + pass());
        System.out.println("  --> " + pass());
        System.out.println("  --> " + pass());
        System.out.println("==========================================================");
/*
        System.out.println("Task #10");
        System.out.println("  --> " + pass());
        System.out.println("  --> " + pass());
        System.out.println("  --> " + pass());
        System.out.println("==========================================================");
*/
    }

    // TODO Task 1
    public static String hiddenAnagram(String str1, String str2) {
        str1 = str1.toLowerCase().replaceAll("[^a-z]", "");
        str2 = str2.toLowerCase().replaceAll("[^a-z]", "");

        for (int i = 0; i <= str1.length() - str2.length(); ++i) {
            String substr = str1.substring(i, i + str2.length());
            if (isAnagramFrom2Tasks(str2, substr)) {
                return substr;
            }
        }

        return "not found";
    }

    // TODO Task 2
    public static String[] collect(String str, int n) {
        int count = str.length() / n;
        String[] answer = new String[count];

        for (int i = 0; i < count; ++i) {
            answer[i] = str.substring(i * n, i * n + n);
        }

        Arrays.sort(answer);
        return answer;
    }


    // TODO 3
    public static String nicoCipher(String message, String key) {

        return "";
    }

    // TODO Task 4
    public static int[] twoProduct(int[] arr, int number) {
        int[] answer = new int[0];
        int gap = arr.length;

        for (int i = 0; i < arr.length; ++i) {
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[i] * arr[j] == number && gap > j - i) {
                    answer = new int[]{arr[i], arr[j]};
                    gap = j - i;
                }
            }
        }

        return answer;
    }

    // TODO Task 5
    public static int[] isExact(int number) {
        return findFactorial(number, 1, 1);
    }

    public static int[] findFactorial(int number, int current, int factorial) {
        if (current == number) {
            return new int[]{number, factorial - 1};
        } else if (current < number) {
            return findFactorial(number, current * factorial, factorial + 1);
        }

        return new int[0];
    }
    
    // TODO 6
    public static String fractions(String str) {
        return "";
    }

    // TODO 7


    // TODO 8


    // TODO 9


    // TODO 10









    public static String pass() {
        return "";
    }

    // Function that tests two strings to see if they are anagrams
    static boolean isAnagramFrom2Tasks(String firstString, String secondString) {
        char[] first = firstString.toCharArray();
        char[] second = secondString.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first, second);
    }
}