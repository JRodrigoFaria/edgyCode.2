import java.util.Scanner;

public class Ex01{

    public static final Scanner sc = new Scanner(System.in);
    
    public void run(){
        System.out.printf("Operation?");
        String tocalculate = sc.nextLine();
        calculator(tocalculate);
    }
    
    public static void calculator(String tocalculate){
        // Divide the string to get the numbers and the operator
        String[] splitedstring = tocalculate.split(" ");
        
        // Make the numbers become doubles since we can't calculate anything with strings
        double num1 = Double.parseDouble(splitedstring[0]);
        double num2 = Double.parseDouble(splitedstring[2]);
        
        // Pick the operation and print the result
        switch (splitedstring[1]) {
            case "+":
                System.out.print(num1+num2);
                break;
            case "-":
                System.out.print(num1-num2);
                break;
            case "*":
                System.out.print(num1*num2);
                break;
            case "/":
                System.out.print(num1/num2);
                break;
            default:
                System.err.print("Invalid Operator");
                break;
        }
    }
    
}