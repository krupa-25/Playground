import java.util.Scanner;
public class Main {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int base = sc.nextInt();
      int exp = sc.nextInt();
     fs(base,exp);
   }
  public static void fs(int base, int exp){
        long result = 1;

        while (exp != 0)
        {
            result *= base;
            --exp;
        }

        System.out.println(result);
    }
 
}