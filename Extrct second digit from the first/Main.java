import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner n=new Scanner(System.in);
      int num=n.nextInt();
   
      while(num>=100){
       num=num/10;}
      int n4=num%10;
      System.out.println(n4);
	}
}