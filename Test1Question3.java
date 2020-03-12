/*Name: NG KE RONG*/
/*No.Matrik:271063*/

import java.util.*;

public class Test1Question3 {
   
   static Scanner sc = new Scanner (System.in); 
   
   public static void main (String[] args) {
   
      System.out.print("Enter a first String value :");
      String word1 = sc.nextLine();
      System.out.print("Enter a second String value :");
      String word2 = sc.nextLine();
        
      if(word1.equals(word2)){
            
            System.out.println("Both String value are equal.");
            
      }else{
            
            System.out.println("Both String value are not equal. ");
      }
   }
}   