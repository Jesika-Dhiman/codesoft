package ATM_INERFACE;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        //Create the account number and initialize  the account
        Bank_Account bankAccount=new Bank_Account("SB1001",1000);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Choice: ");
        System.out.println("1.Deposit");
        System.out.println("2.Withdraw");
        int choice= scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the amount: ");
                    double amount1 = scanner.nextDouble();
                    bankAccount.deposit(amount1);
                    break;
                case 2:
                    System.out.println("Enter the amount : ");
                    double amount2 = scanner.nextDouble();
                    bankAccount.withdraw(amount2);
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
}

