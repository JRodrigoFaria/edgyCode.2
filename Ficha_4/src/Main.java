import java.util.Scanner;

public class Main {
    
    public static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
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
                
        }
    }
    
}
