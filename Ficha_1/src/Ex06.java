import java.util.Scanner;

public class Ex06{
    
    public static int score = 0;
    
    public static final Scanner sc = new Scanner(System.in);
    
    public void run(){
        // Get the random number
        int number = (int) (Math.random() * (101));
        int attempt;
        
        System.out.println("Guess the number! [0;100]");
        
        // Game
        while (true){
            attempt = sc.nextInt();
            
            if (attempt < number){
                System.out.println("Up");
                score++;
            }else if (attempt > number){
                System.out.println("Down");
                score++;
            }else break;
        }
        
        // Game result
        System.out.println("Congrats! You won with a score of: "+score+" points");
    }
}
