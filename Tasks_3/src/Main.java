public class Main {
    public static void main(String[] args) {
        System.out.println("Task #1");
        System.out.println("apple  --> " + replaceVovels("apple"));
        System.out.println();
        System.out.println("Even if you did this task not by yourself, " +
                "you have to understand every single line of code. -->");
        System.out.println(replaceVovels("Even if you did this task not by yourself, " +
                "you have to understand every single line of code."));
        System.out.println("==========================================================");

        System.out.println("Task #2");
        System.out.println("helicopteRR --> " + stringTransform("helicopteRR"));
        System.out.println("helicopter --> " + stringTransform("helicopter"));
        System.out.println("hello --> " + stringTransform("hello"));
        System.out.println("rr --> " + stringTransform("rr"));
        System.out.println("bookkeeper --> " + stringTransform("bookkeeper"));
        System.out.println("==========================================================");

        System.out.println("Task #3");
        System.out.println("a=1, b=3, c=5, h=4, w=5 --> " + doesBlockFit(1, 3, 5, 4, 5));
        System.out.println("a=1, b=8, c=1, h=1, w=1 --> " + doesBlockFit(1, 8, 1, 1, 1));
        System.out.println("a=1, b=2, c=2, h=1, w=1 --> " + doesBlockFit(1, 2, 2, 1, 1));
        System.out.println("==========================================================");

        System.out.println("Task #4");
        System.out.println("243 --> " + numCheck(243));
        System.out.println("52 --> " + numCheck(52));
        System.out.println("==========================================================");

        System.out.println("Task #5");
        int[] task5_1 = {1, -3, 2};
        int[] task5_2 = {2, 5, 12};
        int[] task5_3 = {1, -6, 9};
        System.out.println("x^2 - 3x + 2 = 0   --> " + countRoots(task5_1));
        System.out.println("2x^2 + 5x + 12 = 0 --> " + countRoots(task5_2));
        System.out.println("x^2 - 6x + 9 = 0   --> " + countRoots(task5_3));
        System.out.println("==========================================================");

        System.out.println("Task #6");
        String[][] task6_1 = {{"Apple", "Shop1", "Shop2", "Shop3", "Shop4"},
                              {"Banana", "Shop2", "Shop3", "Shop4"},
                              {"Orange", "Shop1", "Shop3", "Shop4"},
                              {"Pear", "Shop2", "Shop4"}};

        String[] ans = salesData(task6_1);
        for (String i : ans) {
            System.out.printf(i + " ");
        }
        System.out.println();
        String[][] task6_2 = {{"Fridge", "Shop2", "Shop3"},
                              {"Microwave", "Shop1", "Shop2", "Shop3", "Shop4"},
                              {"Laptop", "Shop3", "Shop4"},
                              {"Phone", "Shop1", "Shop2", "Shop3", "Shop4"}};

        ans = salesData(task6_2);
        for (String i : ans) {
            System.out.printf(i + " ");
        }
        System.out.println();
        System.out.println("==========================================================");


        System.out.println("Task #7");
        System.out.println("apple eagle egg goat --> " + validSplit("apple eagle egg goat"));
        System.out.println("cat dog goose fish --> " + validSplit("cat dog goose fish"));
        System.out.println("==========================================================");

        System.out.println("Task #8");
        System.out.println("{3, 1, 4, 2, 7, 5} is wavy? -- > " + waveForm(new int[] {3, 1, 4, 2, 7, 5}));
        System.out.println("{1, 2, 3, 4, 5} is wavy? -- > " + waveForm(new int[] {1, 2, 3, 4, 5}));
        System.out.println("{1, 2, -6, 10, 3} is wavy? -- > " + waveForm(new int[] {1, 2, -6, 10, 3}));
        System.out.println("==========================================================");

        System.out.println("Task #9");
        System.out.println("Hello world --> " + commonVovel("Hello world"));
        System.out.println("Actions speak louder than words. --> " +
                commonVovel("Actions speak louder than words."));
        System.out.println("==========================================================");

        System.out.println("Task #10");
        int[][] task10_1 = {{1, 2, 3, 4, 5},
                            {6, 7, 8, 29, 10},
                            {5, 5, 5, 5, 35},
                            {7, 4, 3, 14, 2},
                            {1, 0, 11, 10, 11}};

        int[][] task10_2 = {{6, 4, 19, 0, 0},
                            {81, 25, 3, 1, 17},
                            {48, 12, 60, 32, 14},
                            {91, 47, 16, 65, 217},
                            {5, 73, 0, 4, 21}};

        int[][] answer = dataScience(task10_1);

        for (int i = 0; i < answer.length; ++i) {
            for (int j = 0; j < answer.length; ++j) {
                System.out.printf(answer[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("======================");

        answer = dataScience(task10_2);

        for (int i = 0; i < answer.length; ++i) {
            for (int j = 0; j < answer.length; ++j) {
                System.out.printf(answer[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("==========================================================");
    }


    // A function that replaces all vowels with the symbol “*”
    static String replaceVovels(String str) {
        return str.replaceAll("[AEYUIOaeyuio]", "*");
    }


    // А function that replaces two consecutive letters using the “Double*” pattern
    static String stringTransform(String str) {
        StringBuilder answer = new StringBuilder();
        char c1, c2;

        c1 = str.charAt(0);
        c2 = str.charAt(1);

        for (int i = 1; i < str.length(); ++i) {
            c2 = str.charAt(i);

            if (c1 == c2) {
                answer.append("Double");
                i += 1;

                if (c1 > 96) {
                    c1 -= 32;
                }

                if (i < str.length()) {
                    c2 = str.charAt(i);
                } else {
                    c2 = c1;
                    break;
                }
            }

            answer.append(c1);
            c1 = c2;
        }

        answer.append(c2);
        return answer.toString();
    }


    // A function that determines whether a block can fit into a hole
    static boolean doesBlockFit(int a, int b, int c, int h, int w) {
        int x;

        if (a > b) {
            x = a;
            a = b;
            b = x;
        }

        if (b > c) {
            x = b;
            b = c;
            c = x;
        }

        return a * b <= w * h;
    }


    // A function that determines the parity of a number and the sum of the squares of its digits
    static boolean numCheck(int number) {
        int sum = 0;
        int ans = number % 2;

        while (number > 0) {
            sum += (number % 10) * (number % 10);
            number /= 10;
        }

        return ans == (sum % 2);
    }


    // A function that counts the number of integer roots of a quadratic equation
    static int countRoots(int[] array) {
        if (array[1] * array[1] - 4 * array[0] * array[2] < 0) {
            return 0;
        } else if (array[1] * array[1] - 4 * array[0] * array[2] == 0) {
            return 1;
        } else {
            return 2;
        }
    }


    // А function that returns the products that were sold in each store
    static String[] salesData(String[][] date) {
        int[] arr = new int[date.length];
        int maxVal = 0;
        int count = 1;

        for (int i = 0; i < date.length; ++i) {
            if (maxVal != date[i].length) {
                if (maxVal < date[i].length) {
                    maxVal = date[i].length;
                    count = 1;
                }

            } else {
                count += 1;
            }

            arr[i] = date[i].length;
        }

        String[] answer = new String[count];
        count = 0;

        for (int i = 0; i < date.length; ++i) {
            if (arr[i] == maxVal) {
                answer[count] = date[i][0];
                count += 1;
            }
        }

        return answer;
    }


    // A function that tests a sentence against words so that each word begins with the last
    // letter of the previous word
    static boolean validSplit(String str) {
        String[] words = str.split(" ");

        for (int i = 0; i < words.length - 1; ++i) {
            if (words[i].charAt(words[i].length() - 1) !=
                    words[i + 1].charAt(0)) {
                return false;
            }
        }

        return true;
    }


    // A function that determines whether a given array is "wavy"
    static boolean waveForm(int[] array) {
        for (int i = 1; i < array.length - 1; ++i) {
            if ((array[i] > array[i - 1] && array[i] > array[i  + 1]) ||
                    (array[i] < array[i - 1] && array[i] < array[i  + 1])) {
                continue;
            }
            return false;
        }

        return true;
    }


    // A function that finds the most frequent vowel in a sentence
    static char commonVovel(String str) {
        char[] array = str.toLowerCase().toCharArray();
        int[] vovels = new int[6];
        int maxCount = 0;

        for (int i = 0; i < str.length(); ++i) {
            switch (array[i]) {
                case 'a':
                    vovels[0] += 1;
                    maxCount = Math.max(maxCount, vovels[0]);
                    break;
                case 'e':
                    vovels[1] += 1;
                    maxCount = Math.max(maxCount, vovels[1]);
                    break;
                case 'y':
                    vovels[2] += 1;
                    maxCount = Math.max(maxCount, vovels[2]);
                    break;
                case 'u':
                    vovels[3] += 1;
                    maxCount = Math.max(maxCount, vovels[3]);
                    break;
                case 'i':
                    vovels[4] += 1;
                    maxCount = Math.max(maxCount, vovels[4]);
                    break;
                case 'o':
                    vovels[5] += 1;
                    maxCount = Math.max(maxCount, vovels[5]);
                    break;
            }
        }

        for (int i = 0; i < 6; ++i) {
            if (vovels[i] == maxCount) {
                switch (i) {
                    case 0:
                        return 'a';
                    case 1:
                        return 'e';
                    case 2:
                        return 'y';
                    case 3:
                        return 'u';
                    case 4:
                        return 'i';
                    case 5:
                        return 'o';
                }
            }
        }

        return ' ';
    }


    // A function that changes every n-th element of the n-th array to the arithmetic mean
    // of the elements of the nth column of the remaining arrays
    static int[][] dataScience(int[][] date) {

        for (int i = 0; i < date.length; ++i) {
            int ans = 0;

            for (int j = 0; j < date.length; ++j) {
                if (i != j) {
                    ans += date[j][i];
                }
            }

            ans = Math.round(ans / 4.0f);

            date[i][i] = ans;
        }

        return date;
    }
}
