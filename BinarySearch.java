import java.util.Arrays;
class BinarySearch
{
    public static int bsearch(int[] a,int key)
    {
        int low=0;
        int high=(a.length)-1;        
        while(low<=high) //whenever it is true it will execute this block 
        {
            int mid=(low+high)/2;
            if(key==a[mid])
                {   
                    return mid;
                }
            else if(key<a[mid]) 
                {
                    high=mid-1;   
                }
            else
                {
                    low=mid+1;
                }
        }
        return -1;
    }
    public static void main(String[] main)
    {
        int[] ar={324,35,45,654,3546,455,10,234,32};
        Arrays.sort(ar);//to work with binary search array needs to be sorted 
        for(int a:ar)
        {
            System.out.print(a);
            System.out.print("  ");
        }
        System.out.println();
        int k=324;
        int result=bsearch(ar, k);
        System.out.println(result);
    }
}