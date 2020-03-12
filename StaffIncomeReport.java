/*Name: NG KE RONG*/
/*No.Matrik : 271063*/

package quiz;

import java.util.Scanner;
import java.text.DecimalFormat;
        
public class StaffIncomeReport {
    
    static Scanner sc = new Scanner (System.in);
    
    public static void main(String []args){
        
        System.out.print("Enter a staff's name\t\t\t\t: ");
        String staffName = sc.nextLine();
        System.out.print("Enter a staff's id\t\t\t\t: ");
        String staffId = sc.nextLine();
        System.out.print("Enter a staff's income type\t\t\t: ");
        String incomeType = sc.nextLine();
        System.out.print("Enter a staff's income amount (RM)\t\t: ");
        double incomeAmount = sc.nextDouble();
        System.out.print("Enter a staff's income tax percentage (%)\t: ");
        double incomeTax = sc.nextDouble();
        
        //Call Income class
        Income income = new Income( incomeType, incomeAmount, incomeTax );
        //Call Staff class
        Staff info = new Staff( staffName, staffId, income );
        
        //Display Output
        info.displayStaffInfo();
        info.displayIncomeInfo();
    }
             
}

class Staff{
    
    String name;
    String id;
    Income Income;
    
    Staff(String name, String id, Income Income){
        
        this.name = name;
        this.id = id;
        this.Income = Income;
        
    }
    
    String getName(){
    
        return name;
    }
    
    String getID(){
        
        return id;
        
    }
    
    double calculateNetIncome(){
        
       return  Income.getAmount() - Income.getTotalTax();
    }
    
    void displayStaffInfo(){
        
        System.out.println("\n\t\t\tStaff Info\t\t\t\n");
        System.out.println("Staff's Name\t\t\t: " + name);
        System.out.println("Staff's ID\t\t\t: " + id);
    }
    
    void displayIncomeInfo(){
        
        DecimalFormat DF = new DecimalFormat ("0.00");
        
        System.out.println("\n\t\t\tIncome Info\t\t\t\n");
        System.out.println("Status Income\t\t\t: " + Income.getIncomeType());
        System.out.println("Amount of Income\t\t: " + Income.getAmount());
        System.out.println("Income Tax Percentage\t\t: " + Income.getTax() + "%");
        System.out.println("Total Tax Paid (RM)\t\t: " + DF.format(Income.getTotalTax()));
        System.out.println("Total Net Income (RM)\t\t: " + DF.format(calculateNetIncome()));
    }
}

class Income {
    
    String incomeType = "";
    double amount;
    double tax;
    double totalTax;
    
    Income( String incomeType, double amount, double tax){
        
        this.incomeType = incomeType;
        this.amount = amount;
        this.tax = tax;
        
    }
    
    String getIncomeType(){
        
        return incomeType;
    }
    
    double getAmount(){
        
        return amount;
        
    }
    
    double getTax(){
        
        return tax;
        
    }
    
    double getTotalTax(){
        
        totalTax = (tax/100) * amount ;
        return totalTax;
        
    }
}