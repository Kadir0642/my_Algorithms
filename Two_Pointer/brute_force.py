import time
import random

arr=[10,20,35,40,50,60,65]
n=len(arr)
target=90


arr.sort()# It's better to sort the array before entering the function. 

def brute_force_solution(arr,target):

    
    for i in range(n):
        for j in range(i+1,n):
            current_sum=arr[i]+arr[j]
            if current_sum==target:
                return True
    
    return False

new_arr=[random.randint(1,1000) for _ in range(10000)]
target=1500
start=time.time()
result=brute_force_solution(new_arr,target)
finish=time.time()-start
print(f"Two pointer: {finish:9f}")
    
