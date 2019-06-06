import java.util.Scanner;
class Main{
  public static int sum(int m){
    if(m!=0)
    return(m+sum(m-1));
      else return m;
  }
    
  
	public static void main (String[] args){
	    // Type your code here
      	Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int res=sum(n);
      System.out.println(res);
	}
}