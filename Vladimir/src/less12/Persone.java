package src.less12;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Persone {
    public static void main(String[] args) {
        System.out.println("please enter 1");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            final String stringFromScanner = scanner.nextLine();

            String stringPersone = "firstname, lastname, phone, email";

//            String text = "abc123 abc bbc cbc ccc";
//            Pattern pattern = Pattern.compile("(\\w+)");
//            Matcher matcher = pattern.matcher(text);
//
//            //method find, start, end
//            while (matcher.find()) {
//                int start = matcher.start();
//                int end = matcher.end();
//                System.out.println("Found a match - " + text.substring(start, end) + " from index " + start + " to " + (end - 1));
//                System.out.println(matcher.group());
//            }
//            System.out.println(matcher.groupCount());
//
            String text = "abc";

            //method pattern
            Pattern pattern = Pattern.compile("abc");
            System.out.println(pattern.pattern());

            //method matches
            System.out.println(Pattern.matches("abc", text));

            //method matcher
            System.out.println(pattern.matcher(text).matches());

            //method flags
//        System.out.println(pattern.flags());
            Pattern pattern2 = Pattern.compile("abc", Pattern.CASE_INSENSITIVE);
            System.out.println(pattern2.flags());

            Pattern pattern1 = Pattern.compile("[a-zA-Z]");
            Pattern pattern3 = Pattern.compile("[a-z]", Pattern.CASE_INSENSITIVE);

            System.out.println(pattern3.pattern());

            String e = "\"Java\"";

            //method indexOf
            System.out.println(stringPersone.indexOf('o'));
            System.out.println(stringPersone.indexOf('o', 5));

            //method lastIndexOf
            System.out.println(stringPersone.lastIndexOf('o'));
            System.out.println(stringPersone.lastIndexOf('o', 6));

            //method replace
            System.out.println(stringPersone.replace("l", "K"));
        }
        scanner.close();
    }

}
