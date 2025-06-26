import java.util.Scanner;

public class Main {
    /**
     * simple Java banking program 
     * @param args
     * @author Jaylen 
     */

     //boolean exitprogram=  true;
    
    public static void main(String[] args) {
        
        // declare variables 

        double balance = 0;
        Scanner scanner = new Scanner(System.in);
        boolean exitprogram=  true;
        

        // main menu 
        while(exitprogram)
        {
            System.out.println("////////////////////////////////////");
            System.out.println("Welcome to Jaylen's Bank!");
            System.out.println("////////////////////////////////////\n");
            //System.out.println();
            System.out.println("Choose one of the availabe options below: \n");
            System.out.println("1. Check Balance\n" +
                    "2. withdraw\n" +
                    "3. deposit\n" +
                    "4. Exit\n");
            System.out.println("What is your choice?");
            int choice= scanner.nextInt();

            switch (choice) {
                case 1:
                    
                    checkBalance(balance);
                    break;
                case 2:
                    
                    withdraw(balance);
                    break;
                case 3:
                    
                    deposit(balance);
                    break;
                case 4:
                    
                    exit(exitprogram);
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }
        }
        scanner.close();
    }

    // methods to withdraw
        
    public static void withdraw(double balance)
    {
        boolean exitprogram= true;
        Scanner scanner= new Scanner(System.in);

       System.out.println("How much would you like to  withdraw? ");
        double withdrawAmt= scanner.nextDouble();

        if(withdrawAmt <= balance)
        {
            balance= balance - withdrawAmt;
            System.out.println("Your new balance is: " + balance);
        }
        else if( withdrawAmt > balance)
        {
            System.out.println("Insufficient funds");
        }
        else
        {
            System.out.println("Invalid input, please try again.");
        }

        exit(exitprogram);


        scanner.close();
    }

    // method to check balance 

    public static void checkBalance(double balance)
    {
        boolean exitprogram= true;
        System.out.println("This is your current balance: " + balance);
        exit(exitprogram);
    }

    // method to deposit 

    public static void deposit(double balance)
    {
        boolean exitprogram= true; 
        Scanner scanner= new Scanner(System.in);
        System.out.println("How much would you like to deposit? ");
        double depositAmt= scanner.nextDouble();
        if(depositAmt > 0)
        {
            balance= balance + depositAmt;
            System.out.println("Your new balance is: " + balance);
        }
        else 
        {
            System.out.println("invalid input");
        }
        exit(exitprogram);

        scanner.close();
    }

    // method to exit 

    public static void exit(boolean exitprogram)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Are you sure you do not want to make another transaction? Type y/n");
        String answer= scanner.next();
        if(answer.equalsIgnoreCase("y"))
        {
            System.out.println("Thank you for using Jaylen's Bank!");
            exitprogram= false;
        }
        else if(answer.equalsIgnoreCase("n"))
        {
            System.out.println("Redirecting you to main menu...");
            exitprogram= true;
        }
        else
        {
            System.out.println("Invalid input");
            exit(exitprogram);
        }
        

    }

    
}
