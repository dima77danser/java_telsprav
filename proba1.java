import java.util.Scanner;

public class main{
    public static void main( String[] args){
        Scanner scanner = new Scanner (System.in);
        String s = scanner.next();
        String out = new String("привет,%s");
        System.out.printf(out,s);
    }
}