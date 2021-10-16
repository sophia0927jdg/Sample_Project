
package calculator;
import java.util.Scanner;

public class Calculator {

   
    public static void main(String[] args) {
       Scanner ab = new Scanner(System.in);
       
       System.out.println("Enter 1st number: ");
       int fn = ab.nextInt();
       System.out.println("Enter 2nd number: ");
       int sn = ab.nextInt();
       
       double ans = 0.0;
       
       System.out.println("Enter Operation(+, -, * or /)");
       String op = ab.next();
       
       if(op.equals("+")){
           GarciaAddition sophie = new GarciaAddition();
           ans = sophie.addition(fn, sn);
           System.out.println("The sum is: " +ans);
       }
       else if(op.equals("-")){
           GarciaSubtraction sophie = new GarciaSubtraction();
           ans = sophie.subtraction(fn, sn);
           System.out.println("The difference is: " +ans);
       }
       else if(op.equals("*")){
           GarciaMultiplication sophie = new GarciaMultiplication();
           ans = sophie.multiplication(fn, sn);
           System.out.println("The product is: " +ans);
       }
       else if(op.equals("/")){
           GarciaDivision sophie = new GarciaDivision();
           ans = sophie.division(fn, sn);
           System.out.println("The quotient is: " +ans);
       }
       else{
           System.out.println("Invalid");
       }
    }
    
}

