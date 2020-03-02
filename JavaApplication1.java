
package javaapplication1;

import java.util.*;

public class JavaApplication1 {

    static Scanner sc = new Scanner(System.in); //create new object 
    
    public static void main(String[] args) {
        //Exercise 1

        String college = new String ("College of Arts and Sciences");
        String town = "UUM SINTOK"; // part (a)
        int stringLength;
        String change1, change2, change3;
        stringLength = college.length(); // part (b)
        System.out.println (college + " contains " + stringLength + "characters.");
        change1 = college.toUpperCase(); // part (c)
        System.out.println ("The string is all in upper case: " + change1);
        change2 = change1.replace("O","*"); // part (d)
        System.out.println ("All capital O's are replaced with the asterisk character: " + change2);
        change3 = college.concat(town); // part (e)
        System.out.println ("The final string is " + change3);
        
        //Exercise2
        FunnyString();
        
        //Exercise 3
        Date();
        
        //Exercie 4
        number();
    }
    
    public static void FunnyString(){
        
        System.out.print("Enter your favourite colour\t:");
        String colour = sc.nextLine();
        
        System.out.print("Enter your favourite food\t:");
        String food = sc.nextLine();
        
        System.out.print("Enter youar favourite animal\t:");
        String animal = sc.nextLine();
        
        System.out.print("Enter your first name of frined\t:");
        String friend = sc.nextLine();
        
        System.out.println("I had a dream that " + friend + " ate a " + colour + " " + animal + " and said it tasted like " + food +"!");
    }
    
    public static void Date(){
      
        System.out.print("Enter day, month and year(in format dd/mm/yy)\t:");
        String tarikh = sc.nextLine();
     
        tarikh = tarikh.replace("/",".");
        
        System.out.println(tarikh);
    }
    
    public static void number(){ //parameter
  
        String num = "";
        int j = 0;
        
        System.out.printf("Ener 4 digit number\t:");
        String digit = sc.nextLine();
            
        for(int i = 0 ; i<4 ; i++){ //condition
            
            System.out.println(digit.charAt(i));
            num = String.valueOf(digit.charAt(i));
            j += Integer.parseInt(num);
            
        }  
        System.out.println(j);
    }

}    
