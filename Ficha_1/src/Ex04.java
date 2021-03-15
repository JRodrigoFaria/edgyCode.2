import java.util.Scanner;

public class Ex04{
    
    public static final Scanner sc = new Scanner(System.in);
    
    public void run(){
        while(true){
            System.out.print("Insert your sentence: ");
            String line = sc.nextLine();
            if ("".equals(line)) break;
            translator(line);
        }
    }
    
    public static void translator(String linha){
        // Changes the characters as wanted
        String str = ((linha.replaceAll("[Rr]", "")).replace('l','u')).replace('L','U');
        
        System.out.printf("Sentence translated to Albertian:\n%s",str);
    }
}
