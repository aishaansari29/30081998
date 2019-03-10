import java.util.*;
class Duplicate
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        List<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            al.add(a[i]);
        }
        int count=0;
        Set<Integer> set=new TreeSet<Integer>(al);
        for(Integer h:set)
        {
          count=Collections.frequency(al,h);
          if(count>1)
          {
              System.out.print(h+" ");
          }
        }
    }
}
