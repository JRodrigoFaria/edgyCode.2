import java.util.Scanner;

public class Main {
    
    public static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        switch (sc.nextLine()){
            case "Ex01":
                Ex01 ex1 = new Ex01();
                ex1.run();
                break;
            case "Ex02":
                Ex02 ex2 = new Ex02();
                ex2.run();
                break;
            case "Ex03":
                Ex03 ex3 = new Ex03();
                ex3.run();
                break;
            case "Ex04":
                Ex04 ex4 = new Ex04();
                ex4.run();
                break;
            case "Ex05":
                Ex05 ex5 = new Ex05();
                ex5.run();
                break;
            case "Ex06":
                Ex06 ex6 = new Ex06();
                ex6.run();
                break;    
            default:
                System.err.print("Exercise doesn't exist");
                break;
        }
    }    
}
