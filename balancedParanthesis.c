#include <stdio.h>
#include <string.h>
 
#define MAXSIZE 100
#define TRUE 1
#define FALSE 0 
 
// Structure defining Stack data structure
struct Stack {
    int top;
    int array[MAXSIZE];
} st;
 
/*
Initializes the top index to -1
*/
void initialize() {
 st.top = -1;
}
 
/*
 Checks if Stack is Full or not 
*/
int isFull() {   
    if(st.top >= MAXSIZE-1)
        return TRUE;
    else
        return FALSE;
}
 
/*
 Checks if Stack is Empty or not
*/
int isEmpty() {
 if(st.top == -1)
     return TRUE;
 else
     return FALSE;
}
 
/*
 Adds an element to stack and then increment top index 
*/
void push(int num) {
    if (isFull())
        printf("Stack is Full...\n");
    else {
        st.array[st.top + 1] = num;
        st.top++;
    }
}
 
/*
 Removes top element from stack and decrement top index
*/
int pop() {
    if (isEmpty())
        printf("Stack is Empty...\n");
    else {
     st.top = st.top - 1;
        return st.array[st.top+1];
    }
}
 
int main() {
    char inputString[100], c;
    int i, length;
    initialize();
    
    gets(inputString);
    length = strlen(inputString);
    
    for(i = 0; i < length; i++){
        if(inputString[i] == '(')
            push(inputString[i]);
        else if(inputString[i] == ')')
            pop();
        
    }
     
    if(isEmpty())
        printf("yes\n");
    else
        printf("no\n");
         
    return 0;
}
