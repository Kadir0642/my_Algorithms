def FirstReverse(strParam):
  
  char_list=list(strParam) 
  # pythonda da stringler Immutable  olduğundan string içi değiştirilemiyor. 
  #bizde içini bir listeye döküp  listeden düzeltme yapıyoruz.
  n=len(char_list)
  left,right=0,n-1

  while left<right:
    char_list[left],char_list[right]=char_list[right],char_list[left]
    left+=1
    right-=1

  return "".join(char_list) # listeyi tekrar string olarak birleştirip gönderiyoruz.

print(FirstReverse(input()))
