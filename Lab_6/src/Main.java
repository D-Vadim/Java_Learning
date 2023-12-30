public class Main {
    public static void main(String[] args) {

        String text = "The .2x p8.48rice of the product is $19.99";
        ReGex.numberFinder(text);
        System.out.println();

        String pass1 = "12345678";
        String pass2 = "123A45678";
        String pass3 = "QWErty1234567890123";
        String pass4 = "QWERTYqwerty";
        String pass5 = "QWEqwe123";
        System.out.println(ReGex.checkPassword(pass1));
        System.out.println(ReGex.checkPassword(pass2));
        System.out.println(ReGex.checkPassword(pass3));
        System.out.println(ReGex.checkPassword(pass4));
        System.out.println(ReGex.checkPassword(pass5));

        String s1 = "Links: https://www.google.com and OPhttps://mtuci.ru/students/training_materials";
        System.out.println(ReGex.replaceLinksToHyperlinks(s1));

        String ip1 = "2055.255.255.255";
        String ip2 = "a.a.a.a";
        String ip3 = "10.10.10.256";
        String ip4 = "10.10.10";
        System.out.println(ReGex.checkIP(ip1));
        System.out.println(ReGex.checkIP(ip2));
        System.out.println(ReGex.checkIP(ip3));
        System.out.println(ReGex.checkIP(ip4));

        text = "Task 5: Finding all words starting with a given letter\n" +
                "wYou need to write a program that will search for all words in\n" +
                "given text, starting with a given letter, and display them on\n" +
                "screen. In this case, the program must use regular expressions\n" +
                "to search for words and handle possible werrors.";

        ReGex.wordsFinder(text, 'w');


    }
}