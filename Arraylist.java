
import java.util.*;

public class Arraylist 
{
    public static void main(String args[])
    {
        System.out.println("\n\n.........ArrayList is Resizabe array which assembles Vector which is in C++ ............\n\n");
        ArrayList<Integer> a=new ArrayList<>();   //<> this is for Generic data types..
        ArrayList<Integer> aa=new ArrayList<> ();
        a.add(3);
        a.add(2);
        System.out.println("\nElements of Arraylist a are : ");
        for(int k:a)
        {
            System.out.println(k);
        }
        System.out.println("Size of ArrayList a is : "+a.size()+"\n");
        aa.add(433);
        aa.add(325);
        aa.add(236);
        a.addAll(aa);
        System.out.println("After adding aa into a : ");
        for(int k:a)
        {
        System.out.println(k);
        }
        System.out.println("This is first element of ArrayList a by using get : "+a.get(0)+"\n");
        System.out.println("Index of element of 433 by usin indexOf : "+a.indexOf(433)+"\n");
        System.out.println("Index of element of 433 : "+a.indexOf(433)+"\n");
        a.set(0,678);
        System.out.println("\nArrayList a after setting an element at specified index which is 0 by set methosd : \n");
        for(int k:a)
        {
            System.out.println(k);
        }
    }
}
