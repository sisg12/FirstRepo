import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello world!");
        Scanner input = new Scanner(System.in);
        System.out.print("your name");
        String name=input.next();
        System.out.print("welcome"+name);

    }
}