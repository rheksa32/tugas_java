import java.util.Scanner;

public class forgetfulmachine {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What city is the capital of france? ");
        keyboard.next();

        System.out.println("What is multiplied 6 by 7? ");
        keyboard.next();

        System.out.println("Enter a number between 0.0 and 0.1? ");
        keyboard.next();

        System.out.println("Is there anythig else you would like to say? ");
        keyboard.next();
    }
}
