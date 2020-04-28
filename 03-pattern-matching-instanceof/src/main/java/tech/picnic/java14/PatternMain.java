package tech.picnic.java14;

public class PatternMain {

  public static void main(String... args) {
    Object msg = "This is a String";

    // We can introduce a *type pattern* after instanceof,
    // which binds `msgString` to the String in `msg` when
    // the type test succeeds
    if (msg instanceof String msgString) {
      // Inside the if, we don't need to cast to String anymore!
      System.out.println(msgString.length());
    }
  }

}
