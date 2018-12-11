/*
 * Kaia Mac
 * 
 * December 11th, 2018
 */

package typecasting;
import java.util.Scanner;
/**
 *
 * @author kamac8665
 */
public class TypeCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
    
        int wholeNum;
        double wholeNumm;
        
        double decimalNum;
        int decimalNumm;
        
        char aChar;
        String singleChar;
        String character;
        
        String name;
        char firstLetter;
        
        String wholeNumber;
        int wholeNumbers;
        
        String decimalNumber;
        double decimalNumbers;
        
        
        System.out.println("-------Type Casting-------");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
//a whole number and stores it as an integer
        System.out.println("Please input a whole number:");
        wholeNum = keyedInput.nextInt();
        System.out.println("");
        
//convert the whole number integer into a double and output it
        wholeNumm = (double)wholeNum;
        System.out.println("The whole number integer as a double is: " + wholeNumm);
        
        
//a decimal number and stores it as a Double
        System.out.println("Please input a decimal number:");
        decimalNum = keyedInput.nextDouble();
        System.out.println("");
        
//convert the decimal number Double into an integer and output it.
        decimalNumm = (int)decimalNum;
        System.out.println("The decimal number double as an integer is: " + decimalNumm);

        
//a single character and stores it as a char
        System.out.println("Please input a single character:");
        singleChar = keyedInput.nextLine();
        aChar = singleChar.charAt(0);
        System.out.println("");
        
//convert the single character into a String and output it.
        character = String.valueOf(aChar);
        System.out.println("The single character as a string is: " + character);
        
        
//a name and stores it as a String
        System.out.println("Please input a name:");
        name = keyedInput.nextLine();
        System.out.println("");
        
//convert the first character of the name into a char and output it.
        firstLetter = name.charAt(0);
        System.out.println("The first letter of that name is: " + firstLetter);

        
//a whole number and stores it as a String
        System.out.println("Please Input a whole number:");
        wholeNumber = keyedInput.nextLine();
        System.out.println("");
        
//convert the whole number String into an integer and output it.
        wholeNumbers = Integer.parseInt(wholeNumber);
        System.out.println("The whole number string as an integer is: " + wholeNumbers);
        
        
//a decimal number and stores it as a String    
        System.out.println("Please Input a decimal number:");
        decimalNumber = keyedInput.nextLine();
        System.out.println("");
        
//convert the decimal number String into a Double and output it. 
        decimalNumbers = Double.parseDouble(decimalNumber);
        System.out.println("The decimal number as a double is: " + decimalNumbers);
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
