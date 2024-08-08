import java.util.*;
public class DSAReverseString 
{
    public static void main(String[] args)
    {
        
         /*................................StringBuilder class instead of String class.................................. */

         //We are supposed to use StringBuilder class to create Strings if we need to perform add , delete operations on string that will take less time 
         StringBuilder sb=new StringBuilder("Hello");
         for(int it = 0;it<sb.length()/2;it++)   //loop will execute till its half size
         {
            int front =it;
            int back = (sb.length()-1)-it;
            //store frontChar and backChar
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            //we have two methods belonging to StringBuilder class
            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
            ///i.e. we have replaced front index by backChar
            /// and we have replaced back index by frontChar
         }
         System.out.println(sb);         
    
    }
}
