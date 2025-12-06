import random
import time

def brute_force_solution(arr,target):
    
    n=len(arr)
    for i in range(n):
        for j in range(i+1,n):
            if arr[i]+arr[j]==target:
                return True
            
    return False

def two_pointer(arr,target):
    n=len(arr)
    arr.sort()
    
    left,right=0,n-1
    
    while left<right:
        current=arr[left]+arr[right]

        if current ==target:
            return True
    
        elif current >target:
            right-=1
        elif current <target:
            left+=1
    
    return False

new_arr=[random.randint(1,1000) for _ in range(10000)]
target=5000  # en kötü senaryoyu düşünürsek asıl performans farklarını bulabiliriz

start=time.time()
brute_force_solution(new_arr,target)
duration=time.time()-start



start=time.time()
two_pointer(new_arr,target)
duration1=time.time()-start

print(f"brute force solution: {duration:.6f}")
print(f"two pointer :  {duration1:.6f} ")
print("-"*50)
