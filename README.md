# Picnic & NLJUG Java 14 Masterclass

![Picnic & NLJUG](logo.png)

Code in this repository is the starting point for all live-coding demos 
in the Java 14 Masterclass. If you want, you can clone this repository
and follow along with the demos, or try them yourself at a later time.

The `master` branch does not use any Java 14 features as-is, that's what we'll
be doing during the masterclass! The resulting code can be found in the
`java14` branch of this repository. 

## Pre-requisites
- Download & unpack Java 14 from http://jdk.java.net/14/ 
- Ensure the `JAVA_HOME` variable points to the JDK installation directory
- If you want to use `javac` from the command-line, ensure the JDK's `bin` 
folder is added to your `PATH`
- Ensure Maven 3.x is installed
- Optional: install [IntelliJ 2020.1](https://www.jetbrains.com/idea/download/) 
(Community Edition is fine), or another IDE with Java 14 language support

## Running the demo code
Within every sub-directory, you can run `mvn compile exec:java` to compile & execute the main
class for that sub-module. 

If you're using an IDE, make sure it is configured to point to the Java 14 JDK,
and that _preview features_ are enabled at the Java 14 language level. For IntelliJ, here's 
[a description](https://blog.jetbrains.com/idea/2020/03/java-14-and-intellij-idea/) 
on how to do so (under 'IntelliJ IDEA configuration').



     