package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int account = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        double initialDeposit = 0;
        boolean deposit = false;
        while(true){
            System.out.print("Is there na initial deposit (y/n)? ");

            char input = sc.next().charAt(0);
            if(input == 'y'){
                System.out.print("Enter initial deposit value: ");
                initialDeposit = sc.nextDouble();
                deposit = true;
                break;
            } else if (input == 'n'){
                break;
            } else {
                System.out.print("Invalid Entrance. Please, type 'y' or 'n'.");
            }
        }

        Account c;
        if(deposit){
            c = new Account(account, holder, initialDeposit);
        } else {
            c = new Account(account, holder);
        }

        System.out.println("\nAccount data:");
        System.out.println(c);


        System.out.print("\nEnter a deposit value: ");
        double depositValue = sc.nextDouble();
        c.deposit(depositValue);

        System.out.println("Updated account data:");
        System.out.println(c);

        System.out.print("\nEnter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        c.withdraw(withdrawValue);

        System.out.println("Updated account data:");
        System.out.println(c);

        sc.close();
    }
}
