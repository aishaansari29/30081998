import java.util.*;
public class PrimeExample{  
 public static void main(String args[]){  
Scanner sc=new Scanner(System.in);
intn=sc.nextInt();
  int i,m=0,flag=0;    
   
  m=n/2;    
  if(n==0||n==1){
   System.out.println("no");    
  }else{
   for(i=2;i<=m;i++){    
    if(n%i==0){    
     System.out.println("no");    
     flag=1;    
     break;    
    }    
   }    
   if(flag==0)  { System.out.println(" yes"); }
  }//end of else
}  
} 
