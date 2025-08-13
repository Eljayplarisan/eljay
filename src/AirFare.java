
import java.util.Scanner;

public class AirFare {

   
    
    public static void main(String[] args) {
        
        Scanner lp = new Scanner(System.in);
        
        float totalclass1 = 0;
        float totalclass2 = 0;
        float Discount1 = 0;
        float Discount2 = 0;
        float Distance = 0;
       
        System.out.print("Distance (Km): ");
        float Km = lp.nextInt();
        
        System.out.print("Class: ");
        int Class = lp.nextInt();
        
        switch (Class){
        
            case 1:
                if(Km <= 1000){
                    totalclass1 = Km *250;
                    Discount1 = (totalclass1 * 0.1f) - Distance;
                    System.out.println("Total Fare: "  +Discount1);
                }else{
                    System.out.println("Total Fare: " + totalclass1);
               }
            break;
            
            case 2:
                if(Km >= 1000){
                 totalclass2 = Km * 500;
                 Discount2 = (totalclass2 * 0.1f) - Distance;
                    System.out.println("Total Fare: " +Discount2);
                }else{
                    System.out.println("Total Fare: " + totalclass2);
                
                }
                
            break;
                
        
             
        
        
        
        }
        
       
        
        
        
        
        
        
        
    }
    
}
