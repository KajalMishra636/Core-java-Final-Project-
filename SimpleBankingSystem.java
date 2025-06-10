import java.util.Scanner;
public class SimpleBankingSystem {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		double balance = 1000.0; //Initial balance
         double amount;
         int choice;
         System.out.println("\n\t===== Welcome to Simple Bank ====");
         System.out.println("\n\tYour Current balance is: $" + balance);
        
         System.out.println("\n\tChoose a transaction: ");
         System.out.println("\t1. Deposit");
         System.out.println("\t2. Withdraw");
         
         System.out.print("\tEnter your choice ()1 or 2):");
         choice = scanner.nextInt();
         
         if(choice == 1) {
         System.out.print("\n\tEnter the amount to deposite: $");
         amount = scanner.nextDouble();
         
         
         if (amount > 0) {
        	 balance +=amount;
        	 
        	 System.out.printf("\tDeposite successful!\n\tnew Balance $%.2f\n", balance);
         
         }else {
        	 System.out.println("\tInvalid deposit amount.");
        	
         }
         
         } else if (choice == 2) {
        	 System.out.print("\n\tEnter amount to withdraw : $");
             amount = scanner .nextDouble();      	 
             
             if (amount > 0 && amount <= balance) {
            	 balance  -= amount;
            	  System.out.printf("\tWithdrawal successful!\n\tNew Balance: $%.2f\n", balance);
             } else if (amount > balance) {
                 System.out.println("\tInsufficient balance.");
             } else {
                 System.out.println("\tInvalid withdrawal amount.");
             }

         } else {
             System.out.println("\tInvalid choice. Please select 1 or 2.");
         }
         
         scanner.close();
	}
	}

            	 
            	 
         
         
         
         
         
         
         
         
         
         
         
         
         
         
      
        