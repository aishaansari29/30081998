#include <stdio.h> 
#include <math.h> 
  
/* function to check if  
point collinear or not*/
void collinear(int x1, int y1, int x2,  
               int y2, int x3, int y3) 
{ 
    if ((y3 - y2) * (x2 - x1) ==  
        (y2 - y1) * (x3 - x2)) 
        printf("Yes"); 
    else
        printf("No"); 
} 
  
// Driver Code 
int main() 
{ 
    int x1 , x2, x3,y1, y2, y3;   
        
        scanf("%d %d",&x1,&y1);
        scanf("%d %d",&x2,&y2);
        scanf("%d %d",&x3,&y3);
    collinear(x1, y1, x2, y2, x3, y3); 
    return 0; 
} 
