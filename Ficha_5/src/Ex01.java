import java.util.Scanner;

public class Ex01 {
    
    public static final Scanner sc = new Scanner(System.in);
    
    public static final long[] speed = new long[100];
    
    public static void run(){
        System.out.println(fibbo(sc.nextInt()));
    }
    
    private static long fibbo(int n){
        assert n >= 0;
        assert n < speed.length;
        if (n <= 1) 
            speed[n] = n;
        else if (speed[n] == 0) 
            speed[n] = fibbo(n-2)+fibbo(n-1);
        return speed[n];
    }
}
