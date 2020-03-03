import java.util.*;

public class PrintReverse {
     public static void main (String[] args){
        
        String word;
        int n = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a sentence\t:");
        word = input.nextLine();
        for( n = word.length() - 1; n >= 0 ; n--){
            
             System.out.print(word.charAt(n));
  
         }
   }
}
