public class LinearSearching
{
    public static int linearSearch(int[] arr,int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] a={34,234,52,353,23};
        int key=34;
        System.out.println(linearSearch(a,key));
    }
}
