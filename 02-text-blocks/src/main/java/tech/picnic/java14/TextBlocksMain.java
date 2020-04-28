package tech.picnic.java14;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class TextBlocksMain {

    public static void main(String... args) throws Exception {
        ScriptEngineManager sem = new ScriptEngineManager();
        ScriptEngine engine = sem.getEngineByName("nashorn");

        String javaScriptOrIsIt = "function getString() {\n" +
                "    return ('\"A JS String!\"');\n" +
                "}\n" +
                "\n" +
                "getString();\n";

        // Text blocks start with three quotes *and* a new-line.
        // Inside a text block, quotes don't need to be escaped,
        // new-lines are preserved, and essential whitespace is
        // preserved in the resulting string.
        String javascript = """
                function getString() {
                    return ('"A JS String!"');
                }
                                
                getString();
           """;

        String output = (String) engine.eval(javascript);

        System.out.println(javaScriptOrIsIt);
        System.out.println(javascript);
        System.out.println("JS Engine output: " + output);
    }

}
