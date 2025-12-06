package Java_Enter;

public class Main
{
    public static void main(String[]args)
    {
        int []arr={0,1,0,3,12};
        // OUTPUT --> 1,3,12,0,0
        System.out.println("Before state: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.printf(" %d ",arr[i]);
        }
        System.out.println("\n");
        System.out.println("After state: ");
        move_zero a=new move_zero(arr);
        a.func();
    }
}
class move_zero
{
    int []arr;
    int non_zero_position=0;
    int len;

    public move_zero(int[]arr)
    {
        len=arr.length;
        this.arr=arr;
    }

    public void func()
    {
            for(int i=0;i<len;i++)
            {
                if(arr[i]!=0)
                {
                    arr[non_zero_position]=arr[i];
                    arr[i]=0;
                    non_zero_position++;
                }
            }
        for(int i=0;i<arr.length;i++)
        {
            System.out.printf(" %d ",arr[i]);
        }
    }
}
