import java.util.*;
class FibonacciSearch
{
    static int fsearch(int[] a,int key)
    {
        if(n==1 || n==2)
        {
            return 1;
        }
        return fsearch(n-1)+fsearch(n-2);
    }
    public static void main(String[] args) 
    {
        int[] arr={32,34,23,52,523,23};
        Arrays.sort(arr);
        for(int a:arr)
        {
            System.out.println(a+" ");
        }
        System.out.println();
        int key=34;
        int result = fsearch(arr,key);
        System.out.println(result);
    }
}