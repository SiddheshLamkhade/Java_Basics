import java.util.HashSet;
import java.util.*;
class Hii extends Thread
{
    public static void main(String args[])
    {
       
       public void run()
       {
        int N=0 ;
        for(int i=0;i<N;i++)
        {
            System.out.println("Current time is : "+System.currentTimeMillis()/1000/3600/24);
        }
       }
    }
}
public class Hashing 
{
    public static void main(String args[])
    {
       HashSet<Integer> h=new HashSet<>();
       h.add(32);
       h.add(322);
       h.add(321);
       for(int a:h)
       {
        System.out.println(a);
       }
       System.out.println("Size of Hash set is : " + h.size());
       h.remove(32);
       for(int a:h)
       {
        System.out.println(a);
       }   
       Hii obj=new Hii();
       obj.start();
    }
}