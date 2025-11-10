import random
import time



def two_pointer(target,arr):

    left,right=0,len(arr)-1

    while left<right:
        current_sum=arr[left]+arr[right]

        if current_sum==target:
            return True
        elif current_sum>target:
            right-=1
        elif current_sum<target:
            left+=1
    
    return False

def brute_force_solution(target,arr):

    n=len(arr)
    for i in range(n):
        for j in range(i+1,n):
            curr_=arr[i]+arr[j]
            
            if curr==target:
                return True
    
    return False

new_arr=[random.randint(1,1000) for _ in range(10000)]
target=1500
new_arr.sort()

# test start 
start=time.time()
two_pointer(target,new_arr)
finish=time.time()-start

start=time.time()
brute_force_solution(target,new_arr)
fin=time.time()-start

print(f"two pointer: {finish:.10f}")
print(f"brute force solution: {fin:.10f}")

