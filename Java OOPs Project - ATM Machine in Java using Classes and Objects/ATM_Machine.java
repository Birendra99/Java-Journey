// It is a simple basic ATM project code using the Class and If else Concepts.
// From this project, We can learn how to used the class and object concepts. 
// In this project, User has already PIN and existing users of that ATM Machine and This one project is not connected to the Database and It's just like a hardcore.
// In this project, Just making the small project using the OOPS CONCEPTS AND ONLY IMPLEMENTING THE 3 FUNCTIONALITY WHICH IS CHECK A/C BALANCE, WITHDRAW MONEY, DEPOSIT MONEY AND EXIT.
// In this project, didnot used the Constructor concepts.
import java.util.Scanner;

class ATM {
    float Balance;
    int PIN=1234;

    public void checkPin() {
        System.out.println("Enter Your Pin");
        Scanner sc = new Scanner(System.in);
        int enterdPin = sc.nextInt();
        // Then we need to check the pin is valid or not
        if (enterdPin == PIN) {
            menu();
        } else {
            System.out.println("Enter a valid PIN Number.");
            checkPin();
        }
    }

    public void menu() {
        System.out.println("Enter Your Choice:");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money.");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if (option == 1) {
            checkBalance();

        } else if (option == 2) {
            withdrawMoney();
        } else if (option == 3) {
            depositMoney();
        } else if (option == 4) {
            return;
        } else {
            System.out.println("Enter the valid Choice");
        }

    }

    public void checkBalance() {
        System.out.println("Balance:" + Balance);
        menu();
    }

    public void withdrawMoney() {
        System.out.println("Enter a Amount to Withdraw:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount > Balance) {
            System.out.println("Insufficient Balance");
        } else {
            Balance = Balance - amount;
            System.out.println("Money Withdrawl Successfully.");

        }
        menu();

    }
    public void depositMoney(){
        System.out.println("Enter the amount:");
        Scanner sc =new Scanner(System.in);
        float amount=sc.nextFloat();
        Balance=Balance+amount;
        System.out.println("Money Deposited Successfully.");
        menu();


    }
}

public class ATM_Machine {
    public static void main(String[] args) {
        ATM obj=new ATM();
        obj.checkPin();
    }

}