 import java.util.*;
 class Reverserecursion
 {
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     int n,result;
     System.out.println("enter the value of n");
     n=sc.nextInt();

    reverse(n);
   }
    static void reverse(int n)
    {
      if(n>0)
    {
      System.out.print(n%10);
      reverse(n/10);
    }
  }
 }
    