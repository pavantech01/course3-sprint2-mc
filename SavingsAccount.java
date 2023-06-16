import  java.util.Random;
import java.util.Scanner;
public class SavingsAccount {

    String bankName = "Coast State Bank";
    long accNumber;
    String accHolderName;
    static double accBalance;
    static boolean accStatus = true;



/*
Scan to take user age
if above 18
take data
*/


    /*public SavingsAccount(String bankName, long accNumber, String accHolderName) {
        this.bankName = bankName;
        this.accNumber = accNumber;
        this.accHolderName = accHolderName;
    }*/

    public SavingsAccount() {
    }

   /* public static long getAccountNumber() {
        *//*long number;
        Random random = new Random(); //Random package for generating random 12 digit numbers frrom=>import  java.util.Random;
        number=random.nextLong(123456789000L);
        System.out.println("Your Account number generated is :"+number);*//*
        return 0;
    }*/

    public static void accountDetails() {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Bank name :"+bankName);
        System.out.println("Enter your name");
        String accHolderName = sc.next();
        System.out.println("Account holder name :" + accHolderName);
        System.out.println();
        System.out.println("Enter the amount you want to deposit (minimum 1000)");
        accBalance = sc.nextInt();
        System.out.println("Initial Account balance :" + accBalance);
        System.out.println();
        System.out.println("Account status :" + (accStatus ? "Active" : "inactive"));
    }

    public void getAge() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age to proceed further");
        int ageNum = sc.nextInt();
        if (ageNum >= 18) {
            System.out.println("Welcome to Coast State Bank You are eligible for opening bank account");
            accountDetails();

            long number;
            Random random = new Random(); //Random package for generating random 12 digit numbers frrom=>import  java.util.Random;
            number = random.nextLong(123456789000L);
            System.out.println("Your Account number generated is :" + number);

            int choice;
            //Scanner scanner = new Scanner(System.in);
            System.out.println("Select the action to proceed");
            System.out.println("1.Show balance");
            System.out.println("2.Credit/Deposit the amount");
            System.out.println("3.Debit/Withdraw the amount");
            System.out.println("Enter your desired choice");
            choice=sc.nextInt();


            if (choice == 1) {
                System.out.println("Account balance" + accBalance);
            }
            else if (choice == 2) {
                System.out.println("Enter amount to credit ");
                Scanner scan = new Scanner(System.in);
                int amount = scan.nextInt();

                if (accStatus) {
                    accBalance = accBalance + amount;
                    System.out.println("Credited " + accBalance);
                    System.out.println("Now your balance is "+accBalance);
                } else {
                    System.out.println("Account inactive");
                }
            }
            else if (choice == 3) {
                System.out.println("Enter amount to withdraw ");
                Scanner scan = new Scanner(System.in);
                int amount = scan.nextInt();

                if (accBalance > amount) {
                    accBalance = accBalance - amount;
                    System.out.println("Debited " + amount);
                    System.out.println("Now your balance is "+accBalance);
                } else {
                    System.out.println("Not Enough account balance to withdraw");
                }
            }

        } else {
            System.out.println("We apologize, but your account cannot be accessed as you do not meet the age requirement.");
        }
    }

}








