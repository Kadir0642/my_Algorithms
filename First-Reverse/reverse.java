import java.util.*; 
import java.io.*;

class Main {

  public static String FirstReverse(String str) 
  {
    // java da stringler değiştirilemediği için onu karakter dizisine (charr array) çeviriyoruz.
    char[] arr=str.toCharArray();

     int len=str.length();
     int left=0,right=len-1; // two pointer mantığıyla tek seferde ( dizinin başından ve solundan işaretçi kullanarak) diziyi dolaşıp işi hallediyoruz

     while(left<right)
     {
      char temp;
      temp=arr[right];
      
      arr[right]=arr[left];
      arr[left]=temp;
      left++;
      right--;
     }

    return new String(arr); // en son kullandığımız char dizisini string olarak geri döndürüyoruz.
  }

  public static void main (String[] args) {  
    
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
  }

}
