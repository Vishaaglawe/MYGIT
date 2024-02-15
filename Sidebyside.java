import java.util.*;
class Sidebyside
{
  public static void main(String args[])
  {
    String s="abcdef";
    String str=" ";
    int i;
for(i=0;i<s.length();i=i+2)
{
  if(i+2<=s.length())
  str=str+s.charAt(i+1)+s.charAt(i);
  else
  str=str+s.charAt(i);
 }
   System.out.println(str);
 }
}