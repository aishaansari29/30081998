import java.util.*;
import java.math.*;


 public class Pallindrome
{
  public static void main(String args[]){

int sum=0,temp=0,r,n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
temp=n;
while(n>0)
{
    r=n%10;
    sum=(sum*10)+r;
    n=n/10;
}
if(temp==sum)
System.out.println("yes");
else
System.out.println("no");
}
}



