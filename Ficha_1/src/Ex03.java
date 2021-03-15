import java.util.Scanner;

public class Ex03 {
    
    public static final Scanner sc = new Scanner(System.in);
    
    public void run(){
        int n;
        
        // Get the number from the user
        while (true){
          System.out.print("What's the number? ");
          n = sc.nextInt();
          if (n > 0) break;
          System.err.println("ERROR: invalid number!");
        }
        
        String verb = isPrime(n)? "is" : "is not";
        System.out.printf("Number %d %s prime\n", n, verb);
    }

    public static boolean isPrime(int n) {
        // for loop to check if the number is prime or not
        for(int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
