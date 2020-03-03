import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class RandomInRange {
   
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int first, second, randInt=0;
        
        System.out.print("Enter the first integer\t:");
        first = sc.nextInt();
        
        System.out.print("\nEnter the second integer\t:");
        second = sc.nextInt();
        
        if(first >= second){
               randInt = 0;
        }else{
               randInt = ThreadLocalRandom.current().nextInt(first-1 , second+1);
        }
        
        System.out.println("The number in range "+ first +" and "+ second + " is " + randInt);
        
  
         }
}
