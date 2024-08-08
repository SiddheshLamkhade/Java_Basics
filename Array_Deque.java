import java.util.*;
public class Array_Deque 
{
    public static void main(String args[])
    {
        ArrayDeque<Integer> ad=new ArrayDeque<>();
        ad.add(22);
        ad.add(34);
        ad.addFirst(343);
        for(int k:ad)
        {
        System.out.println(k);
        }
    }
}
