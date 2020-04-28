package tech.picnic.java14;

public class PatternMain {

  public static void main(String... args) {
    Object msg = "This is a String";

    if (msg instanceof String) {
      String msgString = (String) msg;
      System.out.println(msgString.length());
    }
  }

}
