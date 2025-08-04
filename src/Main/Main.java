package Main;


import java.util.Scanner;
import banking.bankingClass;

public class Main {

    public static void main(String[] args) {
        Scanner lp = new Scanner(System.in);
        bankingClass bank = new bankingClass();
        int attmpts = 5;
        
        
        
        System.out.println("HELLO WELCOME TO MY SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Balance");
        System.out.println("3. Groceries");
        
        System.out.print("Enter Number: ");
        int choice = lp.nextInt();
        
        switch(choice){
            case 1:
                 while( attmpts != 0){
                bankingClass bc = new bankingClass();
                
                System.out.println("Enter your Account No: ");
                int accnt = lp.nextInt();

                System.out.println("Enter your Pin: ");
                int Pin = lp.nextInt();
              
                    if(bc.verifyAccount(accnt, Pin)){
                        System.out.println("Login Success have a great day!!");
                        System.exit(0);
                    }else{
                        attmpts--;
                        System.out.println("INVALID ACCOUNT! Or WRONG PIN! ");
                    }
                    
                    if(attmpts == 0 ){
                        System.out.println("Invalid please try again!! ");
                    }
                
                 } 
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            default:
              
        }
            
    }
    
}
