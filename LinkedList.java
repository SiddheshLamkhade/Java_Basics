import java.util.LinkedList;

public class LinkedList 
{
    public static void main(String args[])
    {
        System.out.println("\n\nNow we will be discovering LinkedList...\n");
        System.out.println("We have introduced LinkedList despite having ArrayList bcaz of Insertion and Deletion Operation anywhere in List..\n");
        System.out.println("When we delete element at second position in ArrayList then we moves all element lying right side to one position to left which takes lot of cost in case of large data\n");
        System.out.println("\n\nBut in LinkedList there is no need to move data to right side as we only connect previous reference to next reference of element to be deleted..\n\n");
        System.out.println("\n\nBut When it comes to Access operation then in LinkedList we have to go through each element to get desired element But in array we can directly access element at specified index..\n\n");


        System.out.println("\n\n\n...........Let's see Operations...........\n\n\n");

        
        
        
        LinkedList<Integer>l=new LinkedList<>();   //<> this is for Generic data types  ..
        LinkedList<Integer>ll=new LinkedList<> ();
        l.add(3);
        l.add(2);
       
    }
}
