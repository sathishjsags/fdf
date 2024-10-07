import java.util.*;
public class Main
{
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a=10,b=1,i;
      String d=sc.next();
      for(i=0;i<d.length();i++)
      {
          if(b>a)
          break;
          if(d.charAt(i)=='w')
          {
              a+=b;
              if(b>1)
              b/=2;
          }
          else{
              a-=b;
              b*=2;
          }
      }
      if(i!=d.length())
      System.out.print("-1");
      else
      System.out.print(a);
}}
