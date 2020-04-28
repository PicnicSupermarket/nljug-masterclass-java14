package tech.picnic.java14;

import java.util.Locale;

public class SwitchMain {

    public static void main(String... args) {
        String product = "donut";

        Locale origin = switch (product) {
            // Cases can now be combined with a comma!
            case "burger", "donut" -> {
                // Statements in the switch are properly scoped. You can
                // now introduce variables with the same name in different
                // right-hand sides of cases in a switch expression.
                String temp = product.toUpperCase();
                System.out.println(temp);
                yield Locale.US;
            }
            // The arrow implies the expression on the right-hand side
            // is returned when the case matches. No `break` necessary
            // anymore!
            case "cheese" -> Locale.forLanguageTag("nl");
            case "maple syrup" -> {
                String temp = "OH CANADA!";
                System.out.println(temp);
                yield Locale.CANADA;
            }
            // Default case only necessary when exhaustiveness cannot be
            // checked by the compiler (so can be left out for enums).
            default -> Locale.getDefault();
        };

        System.out.println(origin);
    }

}
