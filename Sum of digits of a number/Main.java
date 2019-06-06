import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner n=new Scanner(System.in);
      int num=n.nextInt();
      int d=num;int sum=0;
      while(num>0){
        d=num%10;
        sum=sum+d;
        num=num/10;}
      System.out.println(sum);
        
	}
}