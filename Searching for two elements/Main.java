import java.util.Scanner;
class Main{
    public static void main(String args[]){
          Scanner in=new Scanner(System.in);
      int n=in.nextInt();int i;int match=0;
      int arr[]=new int[n];
      for( i=0;i<n;i++){
         arr[i]=in.nextInt();
      }
      int a=in.nextInt();
      int b=in.nextInt();
      for( i=0;i<n;i++){
        if(arr[i]==a){
          System.out.println(i);
          match=1;
          break;}
      }
      if(match!=1)
          System.out.println(-1);
      for(i=0;i<n;i++){
        if(arr[i]==b){
          System.out.println(i);
          match=2;
          break;}
      }if(match!=2)
          System.out.println(-1);
    }
}