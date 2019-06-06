import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner n=new Scanner(System.in);
      int num=n.nextInt();
   int   n1=num%10;
      while(num>=10){
       num=num/10;}
      System.out.println(n1+num);
	}
}