import java.util.*;
class Find_Trailing_Zeroes_After_Calculating_Factorial
{    
    int fun(int n)
    {
      int res=0;
      int powOf5 = 5;
      while(n>=powOf5){
        res=res+ n/powOf5;
        powOf5 = powOf5 *5;
      }
      return res;
    }
}
public class DSATrailingZeroesInFactorial 
{
    public static void main(String[] args)
    {
      Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        Find_Trailing_Zeroes_After_Calculating_Factorial obj=new Find_Trailing_Zeroes_After_Calculating_Factorial();
        int answer=obj.fun(number);
        System.out.println(answer);
    }
}




/*                                     Trailing Zeroes   NO of 5   Trick
 * 2! = 2*1 = 2                              0              0       2/0=0
*  4! = 4*3*2*1 =24                          0              0       4/5=0
*  5! = 5*4*3*2*1 = 120                      1              1       5/5=1
*  6! = 6*5*4*3*2*1 = 720                    1              1       6/5=1
*  7! = 7*6*5*4*3*2*1* = 5040                1              1       7/5=1
*  10! = (10)*9*8*7*6*5*4*3*2*1 = 3628800    
*      = (5*2)*9*8*7*6*5*4*3*2*1 =3628800    2              2       10/5=2
*       i.e. there is one multiple of 5
* 
25! = 
There are 4 number which are  multiple of    
5 and one is 5   
1 2 3 4 5 ------1
6 7 8 9 10 -----5*2----1
11 12 13 14 15 -----5*3---1
16 17 18 19 20 ------5*4----1
21 22 23 24 25 -------5*5---2                 6             6        25/5=5 so here it fails
*                                                                    25/5+25/25=  5+1 = 6
*/

/*
 * Trick here's if we want to find no of trailing zeroes 
 * then we have formula that is n!=n/5  this is no  of trailing zeroes
 * 
 * But for 25!= 25/5 = 5 which should be 6
 * 
 * Now we will divide by 25 and we will add it in privious answer soo we will get same answer 
 * let's check it  25/25=1
 *                 4/25= 0
 *                 5/25=0
 */

 /*
  
n!=n/5+n/25+n/125+.....infinity
  =n/5+n/5²+n/5³+......infinity

5!=5/5+2/25+5/125+......
  =1+0+0+0+0.....
200!=200/5+200/25+200/125+.....
    =40+8+1+0+0+0

  */