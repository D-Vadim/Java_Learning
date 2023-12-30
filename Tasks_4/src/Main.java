import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Math.min;


public class Main {
    public static void main(String[] args) {
        System.out.println("Task #1");
        System.out.println("abracadabra --> " + nonRepeatable("abracadabra"));
        System.out.println("paparazzi   --> " + nonRepeatable("paparazzi"));
        System.out.println("==========================================================");

        System.out.println("Task #2");
        int n = 5;
        char[] str = new char[n * 2];
        ArrayList<String> answer = new ArrayList<String>();
        generateBrackets(answer, n, 0, 0, str, 0);
        System.out.println("n = 3 : " + answer);
        System.out.println("==========================================================");

        System.out.println("Task #3");
        n = 3;
        str = new char[n];
        answer = new ArrayList<String>();
        binarySystem(answer, n, 0, true, str);
        System.out.println("n = 3 : " + answer);
        n = 4;
        str = new char[n];
        answer = new ArrayList<String>();
        binarySystem(answer, n, 0, true, str);
        System.out.println("n = 4 : " + answer);
        System.out.println("==========================================================");

        System.out.println("Task #4");
        System.out.println("abcdjuwx   --> " + alphabeticRow("abcdjuwx"));
        System.out.println("klmabzyxw  --> " + alphabeticRow("klmabzyxw"));
        System.out.println("==========================================================");

        System.out.println("Task #5");
        System.out.println("aaabbcdd --> " + countSymbols("aaabbcdd"));
        System.out.println("vvvvaajaaaaa --> " + countSymbols("vvvvaajaaaaa"));
        System.out.println("==========================================================");

        System.out.println("Task #6");
        System.out.println("eight --> " + convertToNum("eight"));
        System.out.println("five hundred sixty seven --> " + convertToNum("five hundred sixty seven"));
        System.out.println("thirty one --> " + convertToNum("thirty one"));
        System.out.println("==========================================================");

        System.out.println("Task #7");
        System.out.println("123412324 --> " + uniqueSubstring("123412324"));
        System.out.println("1111111 --> " + uniqueSubstring("1111111"));
        System.out.println("77897898 --> " + uniqueSubstring("77897898"));
        System.out.println("123456198723 --> " + uniqueSubstring("1234561987423"));
        System.out.println("==========================================================");

        System.out.println("Task #8");
        System.out.println(shortestWay(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
        System.out.println(shortestWay(new int[][]{{2, 7, 3}, {1, 4, 8}, {4, 5, 9}}));
        System.out.println("==========================================================");

        System.out.println("Task #9");
        System.out.println("t3o the5m 1One all6 r4ule ri2ng --> " +
                numericOrder("t3o the5m 1One all6 r4ule ri2ng"));
        System.out.println("re6sponsibility Wit1h gr5eat power3 4comes g2reat --> " +
                numericOrder("re6sponsibility Wit1h gr5eat power3 4comes g2reat"));
        System.out.println("==========================================================");

        System.out.println("Task #10");
        System.out.println("519, 723  --> " + switchNums(519, 723));
        System.out.println("491, 3912  --> " + switchNums(491, 3912));
        System.out.println("6274, 71259  --> " + switchNums(6274, 71259));
        System.out.println("==========================================================");
    }

    // A recursive function that takes a string and removes duplicate characters from it
    static String nonRepeatable(String str) {
        if (str.length() <= 1) {
            return str;
        }

        if (str.indexOf(str.charAt(0), 1) == -1) {
            return str.charAt(0) + nonRepeatable(str.substring(1));
        }
        return nonRepeatable(str.substring(1));
    }

    // A function that generates all possible correct combinations of pairs of parentheses
    static void generateBrackets(ArrayList<String> answer, int n, int l, int r, char[] str, int count) {
        if (l < r) {
            return;
        }

        if (l == n && r == n) {
            answer.add(String.copyValueOf(str));
        } else {
            if (l < n) {
                str[count] = '(';
                generateBrackets(answer, n, l + 1, r, str, count + 1);
            }

            str[count] = ')';
            generateBrackets(answer, n, l, r + 1, str, count + 1);
        }
    }

    // A function that generates all possible binary combinations of length n
    // that cannot have adjacent zeros
    static void binarySystem(ArrayList<String> answer, int n, int count, boolean prev, char[] str) {
        if (count == n) {
            answer.add(String.copyValueOf(str));
        } else {
            if (prev) {
                str[count] = '0';
                binarySystem(answer, n, count + 1, false, str);
            }
            str[count] = '1';
            binarySystem(answer, n, count + 1, true, str);
        }
    }

    // А function that takes a string and returns the length of the longest consecutive row in that array
    static String alphabeticRow(String s) {
        char[] str = s.toCharArray();
        StringBuilder answer = new StringBuilder();
        int end = 0, len = 1;
        boolean currev = true;
        int cure = 0, curl = 1;


        for (int i = 1; i < s.length(); ++i) {
            if (str[i] - str[i-1] == 1) {
                if (currev) {
                    curl += 1;

                } else {
                    curl = 2;
                    currev = true;
                }

                cure = i;

                if (curl > len) {
                    len = curl;
                    end = cure;
                }

            } else if (str[i-1] - str[i] == 1) {
                if (!currev) {
                    curl += 1;

                } else {
                    curl = 2;
                    currev = false;
                }

                cure = i;

                if (curl > len) {
                    len = curl;
                    end = cure;
                }

            } else {
                curl = 1;
                currev = (str[i-1] < str[i]);

            }
        }

        for (int i = end - len + 1; i <= end; ++i) {
            answer.append(str[i]);
        }

        return answer.toString();
    }

    // A function that counts the number of consecutive characters, replacing repeated characters
    // with the corresponding number
    static String countSymbols(String s) {
        class Symbol {
            private final Character character;
            private final Integer count;

            public Symbol(Character character, Integer count) {
                this.character = character;
                this.count = count;
            }

            public Integer getCount() {
                return count;
            }

            public Character getCharacter() {
                return character;
            }
        }

        class SymbolComparator implements Comparator<Symbol> {
            public int compare(Symbol first, Symbol second) {
                if (first.getCount() >= second.getCount()) {
                    return 1;
                } else if (first.getCount() < second.getCount()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }

        char[] str = s.toCharArray();
        StringBuilder answer = new StringBuilder();
        Comparator<Symbol> comparator = new SymbolComparator();
        TreeSet<Symbol> symbols = new TreeSet<>(comparator);
        int count = 1;

        for (int i = 1; i < s.length(); ++i) {
            if (str[i-1] != str[i]) {
                symbols.add(new Symbol(str[i-1], count));
                count = 1;
            } else {
                count += 1;
            }
        }

        symbols.add(new Symbol(str[s.length()-1], count));

        for (Symbol sb: symbols) {
            answer.append(sb.getCharacter());
            answer.append(sb.getCount());
            // System.out.println(sb.getCount() + " --- " + sb.getCharacter());
        }

        return answer.toString();
    }

    // A function that takes a positive integer in string format and returns its integer representation
    static int convertToNum(String s) {
        String[] str = s.split(" ");
        int number = 0;

        Map<String, Integer> dict = createDictionary();

        for (String word : str) {
            if (word.equals("hundred")) {
                number *= 100;
            } else {
                number += dict.get(word);
            }
        }

        return number;
    }

    // A function that searches for a substring of maximum length with unique elements
    static String uniqueSubstring(String s) {
        StringBuilder answer = new StringBuilder();
        LinkedHashSet<Character> substring = new LinkedHashSet<>();
        char[] str = s.toCharArray();
        int len = 0;

        for (int j = 0; j < s.length(); ++j) {
            for (int i = j; i < s.length(); ++i) {
                if (!substring.contains(str[i])) {
                    substring.add(str[i]);
                } else {
                    if (len < substring.size()) {
                        len = substring.size();
                        answer = new StringBuilder();
                        for (Character ch: substring) {
                            answer.append(ch);
                        }
                    }
                    substring = new LinkedHashSet<>();
                    substring.add(str[i]);
                }
            }
        }

        if (len < substring.size()) {
            answer = new StringBuilder();
            for (Character ch: substring) {
                answer.append(ch);
            }
        }

        return answer.toString();
    }

    // А function that searches for the smallest matrix path
    static int shortestWay(int[][] matrix) {
        int n = matrix.length;
        int[][] answer = new int[n][n];

        answer[0][0] = matrix[0][0];
        if (n == 1) {
            return answer[0][0];
        }

        for (int i = 1; i < n; ++i) {
            answer[0][i] = matrix[0][i] + answer[0][i-1];
            answer[i][0] = matrix[i][0] + answer[i-1][0];
        }

        for (int i = 1; i < n; ++i) {
            for (int j = 1; j < n; ++j) {
                answer[i][j] = matrix[i][j] + min(answer[i-1][j], answer[i][j-1]);
            }
        }
/*
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.printf(answer[i][j] + " ");
            }
            System.out.println();
        }
*/
        return answer[n-1][n-1];
    }

    // Create a function that takes a string containing numbers inside words.
    // These numbers represent the word location for the new line being built.
    static String numericOrder(String str) {
        String[] words = str.split(" ");
        String[] answer = new String[words.length];
        Pattern pattern = Pattern.compile("\\d+");

        for (String word: words) {
            Matcher matcher = pattern.matcher(word);
            if (matcher.find()) {
                answer[Integer.parseInt(matcher.group()) - 1] = word.replaceAll("[0-9]", "");
            }
        }

        return String.join(" ", answer);
    }

    // A function that makes the second number as large as possible by replacing its
    // elements with the elements of the first number
    static String switchNums(int firstNum, int secondNum) {
        char[] num1 = Integer.toString(firstNum).toCharArray();
        char[] num2 = Integer.toString(secondNum).toCharArray();
        StringBuilder answer = new StringBuilder();
        Arrays.sort(num1);

        for (int i = 0; i < num2.length; ++i) {
            int j = num1.length - 1;
            while (j >= 0) {
                if (num2[i] < num1[j]) {
                    num2[i] = num1[j];
                    num1[j] = 0;
                    break;
                }
                --j;
            }
        }

        for (int i = 0; i < num2.length; ++i) {
            answer.append(num2[i]);
        }

        return answer.toString();
    }

    // Creating a dictionary for task 6
    static Map<String, Integer> createDictionary() {
        Map<String, Integer> dict = new HashMap<String, Integer>();

        dict.put("one", 1);
        dict.put("two", 2);
        dict.put("three", 3);
        dict.put("four", 4);
        dict.put("five", 5);
        dict.put("six", 6);
        dict.put("seven", 7);
        dict.put("eight", 8);
        dict.put("nine", 9);
        dict.put("ten", 10);
        dict.put("eleven", 11);
        dict.put("twelve", 12);
        dict.put("thirteen", 13);
        dict.put("fourteen", 14);
        dict.put("fifteen", 15);
        dict.put("sixteen", 16);
        dict.put("seventeen", 17);
        dict.put("eighteen", 18);
        dict.put("nineteen", 19);
        dict.put("twenty", 20);
        dict.put("thirty", 30);
        dict.put("forty", 40);
        dict.put("fifty", 50);
        dict.put("sixty", 60);
        dict.put("seventy", 70);
        dict.put("eighty", 80);
        dict.put("ninety", 90);
        dict.put("hundred", 100);

        return dict;
    }
}
