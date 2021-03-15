import java.util.Scanner;

public class Ex05{
    
    public static final Scanner sc = new Scanner(System.in);
    
    public void run(){
        int num;
        int sum = 0;
        for(int i = 0; i >= 0; i++){
            System.out.print("Number: ");
            num = sc.nextInt();
            if (num!=0){
                sum += num;
                continue;
            }
            System.out.printf("Sum:\t %d\nAverage: ",sum);
            System.out.print(i != 0 ? average(sum,i) : "Can't calculate");
            break;
        }
    }
    
    public static double average(int sum, int numbers){
        if (numbers!=0) return sum/numbers;
        else return 0;
    }
}
