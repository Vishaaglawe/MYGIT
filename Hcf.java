import java.util.*;
class Hcf
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int i,smallest,a,b,hcf=1;

System.out.println("enter the value of a");
a=sc.nextInt();

System.out.println("enter the value of b");
b=sc.nextInt();

smallest=(a<b)?a:b;

for(i=smallest;i>=1;i--)
{
 if(a%smallest==0 && b%smallest==0)
{
  hcf=smallest;
  break;
}
 smallest--;
}
 System.out.println("hcf of two number="+hcf);
}
}



  
  
