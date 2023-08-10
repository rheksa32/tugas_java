import java.util.Scanner;
public class calculateMoneyspent{
    public static void main(String[] args){
    int name;
    int moneyspent;
    int total;
    int totalday = 7;

    Scanner input = new Scanner(System.in);

    System.out.println("Calculate Your Money!!!/n");

    System.out.println("Hey,What Is Your Name");
    name = input.nextInt();

    System.out.println("How much money did you spend at the club on monday");
    moneyspent = input.nextInt();

    total = moneyspent;
    System.out.println("How much money did you spend at the club on tuesday");
    moneyspent = input.nextInt();

    total = total + moneyspent;
    
    System.out.println("How much money did you spend at the club on sunday");
    moneyspent = input.nextInt();

    }
}