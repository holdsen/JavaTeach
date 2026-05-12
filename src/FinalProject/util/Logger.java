package FinalProject.util;

public class Logger {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";

    public static void info(String msg) { System.out.println(BLUE + "[INFO] " + RESET + msg); }
    public static void success(String msg) { System.out.println(GREEN + "[SUCCESS] " + RESET + msg); }
    public static void error(String msg) { System.out.println(RED + "[ERROR] " + RESET + msg); }
}