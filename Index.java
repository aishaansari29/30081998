import java.util.*;
class Index {
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int k=0;
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
if(a[i]==i)
{
k=1;
System.out.print(a[i]+" ");
}
else
{
continue;
}
}
if(k==0)
{
System.out.println("-1");
}}}
