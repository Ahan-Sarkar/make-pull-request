package java_class;
import java.util.*;
public class Fibonacci
{
  public static boolean isPrime(int n)
  {
    if(n<=1)
      return false;
    for(int i=2;i<n;i++)
      if(n%i==0)
        return false;
    
    return true;
  }
  public static void main(String[] args)
  {
    Scanner s c=new Scanner(System.in);
    System.out.println("Enter the MAX Limit");
    int i=sc.nextInt();
    int f1=1,f2=2;
    int count=0;
    System.out.print(f1+" "+f2+" ");
    for(int i=1;i<n-1;i++)
    {
      int nxt=f1+f2;
      if(isPrime(nxt)){
        System.out,print(0+" ");
      }
      else if(nxt%5==0){
        System.out.print(0+" ");
      }
      else{
        System.out.print(nxt+" ");
      }
      f1=f2;
      f2=nxt;
    }
  }
}
        
