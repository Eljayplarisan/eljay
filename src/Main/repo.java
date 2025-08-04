package Main;

import java.util.Scanner;

public class repo {
    
    public static void main(String[] args) {
        Scanner lp = new Scanner(System.in);
        
        
        
        System.out.print("Enter employee name: ");
        String name = lp.nextLine();
        
        System.out.print("Enter hourly rate: ");
        float rate = lp.nextInt();
        
        System.out.print("Enter total hours worked this week: ");
        float week = lp.nextInt();
        
        float Wage = rate*week;
        float SSS = Wage * 0.1f;
         
        System.out.print("\n--------Wage Summery--------");
        System.out.print("\nEmployee: " +name );
        System.out.print("\nHourly Rate: " +rate);
        System.out.printf("\nGross weekly Wage: %.2f\n", Wage);
        System.out.printf("\nSSS contribution (10%%): %.2f\n", SSS);
        
         
    }
    
}
