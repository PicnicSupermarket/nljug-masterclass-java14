package tech.picnic.java14;

import java.util.Locale;

public class SwitchMain {

    public static void main(String... args) {
        String product = "cheese";

        Locale origin = null;

        switch (product) {
            case "burger":
            case "donut":
                origin = Locale.US;
                break;
            case "cheese":
                origin = Locale.forLanguageTag("nl");
                break;
            case "maple syrup":
                origin = Locale.CANADA;
                break;
            default:
                origin = Locale.getDefault();
        }

        System.out.println(origin);
    }

}
