package basic_programming;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class pattern {
    public static void main(String[] args) {
        try {
            Pattern.compile("[AZ[a-z](a-z)");
            System.out.println("Valid");
        } catch (PatternSyntaxException e) {
            System.out.println("Invalid");
        }

    }
}
