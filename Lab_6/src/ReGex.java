import java.util.regex.*;

public class ReGex {
    public static void numberFinder(String text) {
        try {
            Pattern pattern = Pattern.compile("\\d+(.\\d+)?");
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()) {
                System.out.print(matcher.group() + "  ");
            }

        } catch (java.util.regex.PatternSyntaxException e) {
            System.out.println("Error in regular expression");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static boolean checkPassword(String pass) {
        if (pass.length() <= 16 && pass.length() >= 8) {
            try {
                Pattern pattern1 = Pattern.compile("[A-Z]");
                Matcher matcher1 = pattern1.matcher(pass);

                Pattern pattern2 = Pattern.compile("[0-9]");
                Matcher matcher2 = pattern2.matcher(pass);

                Pattern pattern3 = Pattern.compile("[A-Za-z0-9]+");
                Matcher matcher3 = pattern3.matcher(pass);

                return matcher1.find() && matcher2.find() && matcher3.matches();

            } catch (java.util.regex.PatternSyntaxException e) {
                System.out.println("Error in regular expression");
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        return false;
    }

    public static StringBuilder replaceLinksToHyperlinks(String text) {
        StringBuilder answer = new StringBuilder();

        try {
            Pattern pattern = Pattern.compile("(http|https)://[\\S]+");
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()) {
                matcher.appendReplacement(answer, "<a href=\"" + matcher.group() +
                        "\">" + matcher.group() + "</a>");
            }

        } catch (java.util.regex.PatternSyntaxException e) {
            System.out.println("Error in regular expression");
        } catch (Exception e) {
            System.out.println(e);
        }

        return answer;
    }

    public static boolean checkIP(String ip) {
        try {
            String regex = "([1]?\\d\\d?|25[0-5]?|2[0-4]\\d)\\." +
                    "([1]?\\d\\d?|25[0-5]?|2[0-4]\\d)\\." +
                    "([1]?\\d\\d?|25[0-5]?|2[0-4]\\d)\\." +
                    "([1]?\\d\\d?|25[0-5]?|2[0-4]\\d)";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(ip);

            return matcher.matches();

        } catch (java.util.regex.PatternSyntaxException e) {
            System.out.println("Error in regular expression");
        } catch (Exception e) {
            System.out.println(e);
        }

        return false;
    }

    public static void wordsFinder(String text, char letter) {
        try {
            Pattern pattern = Pattern.compile("\\b" + letter + "\\w*");
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()) {
                System.out.print(matcher.group() + "  ");
            }

        } catch (java.util.regex.PatternSyntaxException e) {
            System.out.println("Error in regular expression");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
