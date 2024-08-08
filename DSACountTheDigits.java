import java.util.*;
public class DSACountTheDigits
{
    static int countTheDigits(int number)
    { 
        int count = 0;
        while(number>0)
        {
            number/=10;         ///number=number/10
            count+=1;
        }
        return count;
    }
    public static void main(String[] main)
    {   Scanner obj= new Scanner(System.in);
        int n=obj.nextInt();
        System.out.println(countTheDigits(n));
    }
   
}
 /*
      Whenever we divide no. by 10 it gives decimal number.

      8988                        2345
      ----  =  898.8             ------ = 234.5
       10                          10
      e.g.
      2357 /10=235.7 but we are storing it in int that's why it only store=235
      235 /10=23.5   it store 23 in int
      23 /10=2.3     it will store 2 in int type of variable
      2 /10=0.2      it will store 0 in int type of variable
      
*/