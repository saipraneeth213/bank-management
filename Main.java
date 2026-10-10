import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Bank Management System ===");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your balance: ");
        double balance = sc.nextDouble();

        System.out.println("\nAccount Holder: " + name);
        System.out.println("Account Balance: Rs. " + balance);

        sc.close();
    }
}