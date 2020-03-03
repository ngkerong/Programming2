import java.util.*;

public class CountA {
        /*Question2*/
        public static void main(String[] args){
        String word;
        int n = 0;
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter a sentence\t:");
        word = input.nextLine();
        
        n=CountA(word);
                
        System.out.println("The number of A characte is "+ n);

    }    
    public static int CountA(String word){
    
        int j = 0;
           
        for(int i = 0; i != word.length(); i++){

            if(word.charAt(i) == 'A'){
                
                j++;
            }        
        
        }
    return j;    
    }
    
}
