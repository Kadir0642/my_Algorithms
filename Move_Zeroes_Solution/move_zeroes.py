arr=[0,1,0,3,12]
# OUTPUT --> 1,3,12,0,0

print(arr)
print("Before: ")
print("-"*50)
def func(arr):
    
    n=len(arr)
    
    non_zero_position=0 # pointer for non-zeros 

    for curr in range(n):
        if arr[curr]!=0:
            arr[non_zero_position],arr[curr]=arr[curr],arr[non_zero_position]
            non_zero_position+=1


func(arr)
print(arr)
print("After: ")
print("-"*50)

# time complexity: O(n)  Reason: the loop runs n times
# space complexity: O(1) Reason: it works in-place and uses a fixed amount of extra memory
