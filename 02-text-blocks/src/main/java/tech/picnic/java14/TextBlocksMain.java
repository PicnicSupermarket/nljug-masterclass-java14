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

        String output = (String) engine.eval(javaScriptOrIsIt);

        System.out.println(javaScriptOrIsIt);
        System.out.println("JS Engine output: " + output);
    }

}
