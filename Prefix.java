import java.util.*;
class Prefix
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s[]=new String[n];
		int min=1000000;
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
			s[i]=sc.nextLine();
			if(s[i].length()<min)
				min=s[i].length();
		}
		int b=0;
		int i=0;
		for(i=0;i<min;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(s[j].charAt(i)!=s[j+1].charAt(i))
				{
					b++;
					break;
				}
			}
			if(b==1)
			{
				break;
			}
			else
			{
				System.out.print(s[0].charAt(i));
			}
		}
		
	}
}
