import random
import time

arr=[10,65,60,40,50,35,20]
target=90
n=len(arr)

arr.sort() //It's better to sort the array before entering the function.

def two_pointer(target,arr):

    left,right=0,n-1

    while left<right:
        current_sum=arr[left]+arr[right]
        
        if current_sum==target:
            return True
        elif current_sum<target:
            left+=1
        else:
            right-=1
    
    return False

new_arr=[random.randint(1,1000) for _ in range(10000)]
target=1500

start=time.time()
two_pointer(target,new_arr)
finish=time.time()-start

print(f"Two pointer: {finish:.6f}")
