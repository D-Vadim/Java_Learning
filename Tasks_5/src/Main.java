import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task #1");
        System.out.println("\"ABAB\", \"CDCD\"  --> " + sameLetterPattern("ABAB", "CDCD"));
        System.out.println("\"ABCBA\", \"BCDCB\"  --> " + sameLetterPattern("ABFBA", "BCDCB"));
        System.out.println("\"FFGG\", \"CDCD\"  --> " + sameLetterPattern("FFGG", "CDCD"));
        System.out.println("\"FFFF\", \"ABCD\"  --> " + sameLetterPattern("FFFF", "ABCD"));
        System.out.println("==========================================================");

        System.out.println("Task #2");
        System.out.println("\"H4\", \"E3\"  --> " + spiderVsFly("H4", "E3"));
        System.out.println("\"A4\", \"B2\"  --> " + spiderVsFly("A4", "B2"));
        System.out.println("\"A4\", \"C2\"  --> " + spiderVsFly("A4", "C2"));
        System.out.println("\"A2\", \"B3\"  --> " + spiderVsFly("A2", "B3"));
        System.out.println("==========================================================");
        /*

        System.out.println("Task #3");
        System.out.println("4666 --> " + digitsCount(4666));
        System.out.println("544 --> " + digitsCount(544));
        System.out.println("121317 --> " + digitsCount(121317));
        System.out.println("0 --> " + digitsCount(0));
        System.out.println("12345 --> " + digitsCount(12345));
        System.out.println("1289396387328L --> " + digitsCount(1289396387328L));
        System.out.println("==========================================================");

        System.out.println("Task #4");
        System.out.println("  --> " + totalPoints(new String[]{"cat", "create", "sat"}, "caster"));
        System.out.println("  --> " + totalPoints(new String[]{"trance", "recant"}, "recant"));
        System.out.println("  --> " +
                totalPoints(new String[]{"dote", "dotes", "toes", "set", "dot", "dots", "sted"}, "tossed"));
        System.out.println("==========================================================");

        System.out.println("Task #5");
        System.out.print("1, 2, 3, 4, 5  --> " );
        ArrayList<int[]> arr1 = sumsUp(new int[]{1, 2, 3, 4, 5});
        System.out.print("[ ");
        for (int[] arr : arr1) {
            System.out.printf("[" + arr[0] + ", " + arr[1] + "] ");
        }
        System.out.println("]");

        System.out.print("1, 2, 3, 7, 9  --> ");
        ArrayList<int[]> arr2 = sumsUp(new int[]{1, 2, 3, 7, 9});
        System.out.print("[ ");
        for (int[] arr : arr2) {
            System.out.printf("[" + arr[0] + ", " + arr[1] + "] ");
        }
        System.out.println("]");

        System.out.print("10, 9, 7, 2, 8  --> ");
        ArrayList<int[]> arr3 = sumsUp(new int[]{10, 9, 7, 2, 8});
        System.out.print("[ ");
        for (int[] arr : arr3) {
            System.out.printf("[" + arr[0] + ", " + arr[1] + "] ");
        }
        System.out.println("]");

        System.out.print("1, 6, 5, 4, 8, 2, 3, 7  --> ");
        ArrayList<int[]> arr4 = sumsUp(new int[]{1, 6, 5, 4, 8, 2, 3, 7});
        System.out.print("[ ");
        for (int[] arr : arr4) {
            System.out.printf("[" + arr[0] + ", " + arr[1] + "] ");
        }
        System.out.println("]");
        System.out.println("==========================================================");

        System.out.println("Task #6");
        System.out.println("\"95%\", \"83%\", \"90%\", \"87%\", \"88%\", \"93%\"  --> " +
                takeDownAverage(new String[]{"95%", "83%", "90%", "87%", "88%", "93%"}));
        System.out.println("\"10%\"  --> " + takeDownAverage(new String[]{"10%"}));
        System.out.println("\"53%\", \"79%\"  --> " + takeDownAverage(new String[]{"53%", "79%"}));
        System.out.println("==========================================================");


        System.out.println("Task #7");
        System.out.println("hello world  --> " + caesarCipher("encode", "hello world", 3));
        System.out.println("almost last task!  --> " + caesarCipher("decode", "almost last task!", 4));
        System.out.println("==========================================================");

        System.out.println("Task #8");
        System.out.println("5, 3  --> " + setSetup(5, 3 - 1));
        System.out.println("7, 3  --> " + setSetup(7, 3 - 1));
        System.out.println("==========================================================");

        System.out.println("Task #9");
        System.out.println("April 1, 2011 23:23  --> " +
                timeDifference("Los Angeles", "April 1, 2011 23:23", "Canberra"));
        System.out.println("July 31, 1983 23:01  --> " +
                timeDifference("London", "July 31, 1983 23:01", "Rome"));
        System.out.println("December 31, 1970 13:40  --> " +
                timeDifference("New York", "December 31, 1970 13:40", "Beijing"));
        System.out.println("==========================================================");

        System.out.println("Task #10");
        System.out.println("3  --> " + isNew(3));
        System.out.println("30  --> " + isNew(30));
        System.out.println("321  --> " + isNew(321));
        System.out.println("30009  --> " + isNew(30009));
        System.out.println("==========================================================");
        */
    }

    // A function that returns true if two strings have the same letter pattern
    public static boolean sameLetterPattern(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        char[] str1CharArray = str1.toCharArray();
        char[] str2CharArray = str2.toCharArray();

        for (int i = 0; i < str1.length(); ++i) {
            if (map.containsKey(str1CharArray[i])) {
                if (map.get(str1CharArray[i]) != str2CharArray[i]) {
                    return false;
                }
            } else {
                map.put(str1CharArray[i], str2CharArray[i]);
            }
        }

        return true;
    }

    // A function that returns the shortest path for the spider to get to the fly
    public static String spiderVsFly(String str1, String str2) {
        final int distX = 1;
        final double distBetweenRadials = Math.sqrt(2 - Math.sqrt(2));
        StringBuilder answer = new StringBuilder();

        int spiderX = Integer.parseInt(String.valueOf(str1.charAt(1)));
        int spiderY = str1.charAt(0);
        int flyX = Integer.parseInt(String.valueOf(str2.charAt(1)));
        int flyY = str2.charAt(0);
        int difY = Math.abs(spiderY - flyY);
        int difX = Math.abs(spiderX - flyX);
        if (difY > 4) {
            difY = 8 - difY;
        }
        int index = 0;
        double minLen = distX * (flyX + spiderX);

        if (flyX >= spiderX) {
            for (int i = 1; i <= spiderX; ++i) {
                double curWay = difY * i * distX * distBetweenRadials + 2 * (spiderX - i) + difX;
                if (minLen > curWay) {
                    minLen = curWay;
                    index = i;
                }
            }

        } else {
            for (int i = 1; i <= flyX; ++i) {
                double curWay = difY * i * distX * distBetweenRadials + 2 * (flyX - i) + difX;
                // System.out.println(i + " - " + curWay);
                if (minLen > curWay) {
                    minLen = curWay;
                    index = i;
                }
            }
        }

        boolean flag = false;
        answer.append((char) spiderY).append(spiderX);
        if (spiderX != index) {
            spiderX -= 1;
            flag = true;
        }

        while (spiderX > index) {
            answer.append("-").append((char) spiderY);
            answer.append(spiderX);
            spiderX -= 1;
        }
        if (index == 0) {
            answer.append("-A0");
            spiderY = flyY;
        } else {
            if (flag) {
                answer.append("-").append((char) spiderY).append(spiderX);
            }
            for (int i = 0; i < difY; ++i) {
                if (spiderY - flyY > 0) {
                    --spiderY;
                } else {
                    ++spiderY;
                }
                answer.append("-").append((char) spiderY).append(spiderX);
            }
        }

        ++spiderX;
        while (spiderX <= flyX) {
            answer.append("-").append((char) spiderY).append(spiderX);
            spiderX += 1;
        }

        return answer.toString();
    }

    // A function that recursively counts the number of digits of a number
    public static int digitsCount(long number) {
        if (number / 10 == 0) {
            return 1;
        }
        return 1 + digitsCount(number / 10);
    }

    // A function that returns the total number of points scored by a player in a particular round
    public static int totalPoints(String[] input, String ans) {
        int points = 0;
        char[] answer = ans.toCharArray();
        HashSet<String> words = new HashSet<>(List.of(input));
        HashMap<Character, Integer> answerWord = new HashMap<>();

        for (int i = 0; i < ans.length(); ++i) {
            if (answerWord.containsKey(answer[i])) {
                answerWord.put(answer[i], answerWord.get(answer[i]) + 1);
            } else {
                answerWord.put(answer[i], 1);
            }
        }

        for (String string: words) {
            char[] word = string.toCharArray();
            Arrays.sort(word);
            int count = 1;
            boolean flag = true;

            for (int i = 1; i < word.length; ++i) {
                if (word[i] != word[i-1]) {
                   if (!answerWord.containsKey(word[i-1]) || answerWord.get(word[i-1]) < count) {
                        flag = false;
                        break;
                    }
                    count = 1;
                } else {
                    count += 1;
                }
            }

            if (!answerWord.containsKey(word[word.length-1]) || answerWord.get(word[word.length-1]) < count) {
                flag = false;
            }

            if (flag && string.length() < 6) {
                points += string.length() - 2;
            } else if (flag && string.length() == 6){
                points += string.length() + 48;
            }
        }

        return points;
    }


    // A function that gets each pair of numbers from an array that sums up to eight
    public static ArrayList<int[]> sumsUp(int[] array) {
        ArrayList<int[]> answer = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] + array[j] == 8) {
                    answer.add(new int[]{min(array[j], array[i]), max(array[j], array[i])});
                }
            }
        }

        return answer;
    }

    // What percentage can you score on a test that alone lowers the class average by 5%?
    public static String takeDownAverage(String[] array) {
        double sum = 0;

        for (String res : array) {
            sum += Integer.parseInt(res.replace("%", ""));
        }

        return Math.round((sum / array.length - 5) * (array.length + 1) - sum) + "%";
    }

    // A function that will encrypt and decrypt messages using a Caesar cipher
    public static String caesarCipher(String mode, String str, int shift) {
        char[] text = str.toUpperCase().toCharArray();

        if (mode.equals("encode")) {
            for (int i = 0; i < str.length(); i++) {
                if (text[i] <= 'Z' && text[i] >= 'A') {
                    if (text[i] + shift > 'Z') {
                        text[i] = (char) (text[i] + shift - 'Z' + 'A');
                    } else {
                        text[i] += (char) shift;
                    }
                }
            }
            return String.valueOf(text);

        } else if (mode.equals("decode")) {
            for (int i = 0; i < str.length(); i++) {
                if (text[i] <= 'Z' && text[i] >= 'A') {
                    if (text[i] - shift < 'A') {
                        text[i] = (char) (text[i] - shift - 'A' + 'Z');
                    } else {
                        text[i] -= (char) shift;
                    }
                }
            }

            return String.valueOf(text);

        } else {
            return "Unknown mode";
        }
    }

    // Method for recursively calculating the number of different ways k elements can be placed
    // from a set of n elements without repetition
    public static int setSetup(int n, int k) {
        if (k == 0) {
            return n;
        }
        return setSetup(n, k - 1) * (n - k);
    }

    // A function that calculates what time it is in two different cities
    public static String timeDifference(String city1, String time1, String city2) {
        HashMap<String, Integer> city = getCityDict();

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MMMM d, yyyy HH:mm", Locale.ENGLISH);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-M-d HH:mm", Locale.ENGLISH);

        int diffTime = city.get(city1) - city.get(city2);

        LocalDateTime localDateTime = LocalDateTime.parse(time1, formatter1);
        localDateTime = localDateTime.minusMinutes(diffTime);

        return localDateTime.format(formatter2);
    }

    // A function that takes a non-negative integer and returns true if the integer is a new number
    public static boolean isNew(int n) {
        String number = String.valueOf(n);
        char[] num = number.toCharArray();
        StringBuilder answer = new StringBuilder();
        boolean flag = false;

        Arrays.sort(num);

        for (int i = 0; i < num.length; ++i) {
            if (num[i] != '0') {
                answer.append(num[i]);
                int j = 0;
                if (flag) {
                    while (j != i) {
                        answer.append('0');
                        ++j;
                    }
                    flag = false;
                }
            } else {
                flag = true;
            }
        }

        return number.equals(answer.toString());
    }

    private static HashMap<String, Integer> getCityDict() {
        HashMap<String, Integer> city = new HashMap<>();
        city.put("Los Angeles", -480);
        city.put("New York", -300);
        city.put("Caracas", -270);
        city.put("Buenos Aires", -180);
        city.put("London", 0);
        city.put("Rome", 60);
        city.put("Moscow", 180);
        city.put("Tehran", 210);
        city.put("New Delhi", 330);
        city.put("Beijing", 480);
        city.put("Canberra", 600);

        return city;
    }
}
