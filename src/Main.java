import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name , Password and initial balance");
        String name = sc.next();
        String password = sc.next();
        int balance = sc.nextInt();

        // creating a new account
        SBI_Account rahulAccount = new SBI_Account(name , balance , password);
        System.out.println("Your Account has been created with account number : "+rahulAccount.getAccountNo());

        //check the current balance
        System.out.println("Your current balance is : "+rahulAccount.getBalanace());

        //deposit amount
        System.out.println(rahulAccount.depositeMoney(500));
        System.out.println("New Balance is :"+rahulAccount.getBalanace());

        //withdraw
        System.out.println("Enter amount to withdraw");
        int amount = sc.nextInt();
        System.out.println("Enter the password");
        String enteredPassword  = sc.next();
        System.out.println(rahulAccount.withdraw(amount,enteredPassword));

        // interest
        System.out.println("Interest for 5 years on current balance "+rahulAccount.getBalanace()+" is "+rahulAccount.calculateIntterest(5));
    }
}