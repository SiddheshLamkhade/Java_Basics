import java.util.*;
class DateInJava
{
    public static void main(String args[])
    {
        Date d=new Date();
        System.out.println("\n\nToday's Date and Time is : "+d+"\n\n");
        Calender c=Calendar.getInstance();
        System.out.println(c.getCalenderType());
    }
}