import java.lang.*;
import java.io.*; 
import java.util.*; 
  
class Factorial 
{ 
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
        
        int input = sc.nextInt();
        int fact=1,i;
        if(input==0)
        {
            System.out.println(1);
        }
        else{
            
        
        
        for(i=1;i<=input;i++)
        {
            
                 fact=fact*i;
        }
        System.out.println(fact);
    }
    } 
}
