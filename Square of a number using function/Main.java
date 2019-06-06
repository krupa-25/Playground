import java.util.Scanner;
class Main
{
  public static int square(int m){
    
    return(m*m);
  }
  
	public static void main (String[] args)
    {
		Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int res=square(n);
      System.out.println(res);
	} 
}