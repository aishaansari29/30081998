import java.util.*;
 class RepeatOnce {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int a[]=new int[N];
		for(int i=0;i<N;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++){
			int e=0;
			for(int j=i+1;j<N;j++){
				if(a[i]==a[j]){
					a[j]=0;
					
					e++;
					
				}
			}
			if(e==0){
				if(a[i]!=0)
				
				System.out.print(a[i]);
			}
		}
	}
}
