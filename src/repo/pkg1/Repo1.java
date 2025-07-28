
package repo.pkg1;

import java.util.Scanner;


public class Repo1 {

    
    public static void main(String[] args) {
        
        Scanner lp = new Scanner(System.in);
       
        float total = 0;
        float average = 0 ;
        
        
        System.out.print("Enter Student name: ");
        String name = lp.nextLine();
        
        System.out.print("Enter number of subject: ");
        int sub = lp.nextInt();
        
        
        for(int x = 1 ; x <= sub; x++){
            
            System.out.print("Enter grade for sub " +x+ ":");
            total +=  lp.nextInt();    
        }
        
        average  = total / sub;
        
        if(average >= 75){
            System.out.println("Average: " +average);
            System.out.println("Remarks: PASSED");
        }else{
             System.out.println("Average: " +average);
            System.out.println("Remarks: FAILED");
        }
        
       
        
       
    }
    
}
