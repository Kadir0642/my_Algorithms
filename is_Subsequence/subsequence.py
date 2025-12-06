class Solution:
    def isSubsequence(self, s:str, t:str) ->bool: 
      
        pointerS,pointerT=0,0
      
        while pointerS<len(s) and pointerT<len(t): # herhangi bir diziyi sonuna kadar dolaştığımızda döngü biter.

            if s[pointerS]==t[pointerT]:
                pointerS+=1
            pointerT+=1

        return pointerS==len(s) # harflerin hepsi buluduysa true dönecek

cozum=Solution() # sınıftan nesne oluşturuyoruz

s_input=input("Enter a first string: ")
t_input=input("Enter a second string: ")

result=cozum.isSubsequence(s_input,t_input)

print(f"'{s_input}' dizisi '{t_input}' dizisinin alt kümesimi ? : {result}")
