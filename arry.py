

# importing "array" for array operations 
import array 
n,k=map(int, input().split())   
# initializing array with array values 
# initializes array with signed integers

arr = input()   # takes the whole line of n numbers
l = list(map(int,arr.split(' ')))

 
sum=0
for j in range(0,k):
    sum=sum+l[j]
print(sum)
