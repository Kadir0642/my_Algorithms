package Java_Enter;

import java.util.Arrays;
import java.util.Random;

public class Main
{
    public static void main(String[]args)
    {
        int []arr = new Random().ints(10000,1,1000).toArray(); // toArray burada üretilen sayıları arr dizisine paketliyor. Olmasa üretim olmayacak.
        int target=5000; // worst case , benchmark için                                                     

        Arrays.sort(arr);// diziyi sıralar sort() yapar

        TwoPointer tp=new TwoPointer(arr,target);
        BruteForce bf=new BruteForce(arr,target);

        long start=System.nanoTime();
        tp.solution();
        long bitis=System.nanoTime()-start;
        System.out.println("Two pointer solution: "+bitis/1_000_000.0);

        long basla=System.nanoTime();
        bf.Brute_Force();
        long bit=System.nanoTime()-basla;
        System.out.println("Brute force solution: "+bit/1_000_000.0);

    }
}
class BruteForce
{
    int []arr;
    int target,len;
    public BruteForce(int []a,int target)
    {
        this.len=a.length;
        this.arr=a;
        this.target=target;
    }
    public boolean Brute_Force()
    {
        int curr=0;
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                curr=arr[i]+arr[j];
                if(curr==target)
                {
                    return true;
                }
            }
        }
        return false;
    }
}

class TwoPointer
{
    int []arr;
    int len;
    int target;
    public TwoPointer(int []a,int target)
    {
        this.target=target;
        this.len=a.length;
        this.arr=a;
    }

    public boolean solution()
    {
        int left=0,right=len-1;
        int curr=0;

        while (left<right)
        {
            curr=arr[left]+arr[right];
            if(curr==target)
            {
                return true;
            }else if(curr>target)
            {
                right--;
            }else if(curr<target)
            {
                left++;
            }
        }
        return false;
    }
}
