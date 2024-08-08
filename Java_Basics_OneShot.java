// package Java_Projects;
import java.util.*;
class Student{}

public class Java_Basics_OneShot
{
    public static void main(String[] args)
    {
        /*...................Non primitive data types.......................*/
        /*..................---------String--------......................... */
        /*Class names always start with Capital letter and varibles & functions start with small letter */
        String obj=new String("Hello");
        //...OR....
        obj="Hello";

        //here, class String 
        //its, object obj in which we are storing String type data with the help of new keyword which is used 
        // to allocate new memory to object / entity 

        String obj1="Hello";
        //If we know string to initiliase then we can also initialise like this incase of String.

        System.out.println(obj.length());
        //length is function defined in non primitive data type String  ( String class ) 
        //That's why to access that function we have used ....obj.fun()..... syntax
        //ie. to access methods in class we have used object of that class.
        System.out.println(obj.charAt(0));
        //charAt() is function in String class
        System.out.println(obj.replace('l','r'));
        //replace is also function in string class
        System.out.println(obj.substring(0,1));


        /*........................---------Arrays--------.............................. */
        int[] object= new int[3];
        //here, type of object is int[] or we can say object of int[] class.
        //and in this varible int[] of data will be stored.
        //to allocate memory we have used new keyword and store 3 locations of int type.
        object[0] = 283;
        object[1] = 320;
        object[2] = 823;
        System.out.println(object[0]);
        int[] marks={2,3,3,2,3};
        System.out.println("Range based Loops......");
        
        for(int k:marks)
        {
         System.out.println(k);
        }
        //.............Arrays class..................(built in present in java  util Arrays)
        Arrays.sort(object);
        //sort() function is present in  Arrays .
        //sort() function is present in class named as Arrays .
        System.out.println("After sorting...it will sort in descending order");
        int i=0;
        int n =(object.length-1);
        System.out.println(object instanceof int[]);
       System.out.println(object.length+"******************");
        // here length is not a function it is property of array data type
        while(i<=n)
        {
            System.out.println(object[i]);
            i++;
        }


         /*........................ Objects for Classes .........................*/
         //when we create any new object let's take class Student
         Student objectStudent = new Student();        /////Here Student()is special type of function 
         // and we call it as constructor
         // Here name of object is objStudent and 
         // We have assinged it with new keyword And
         // here Student() is constructor...which is automatically created by compiler
         
         /*........................ Explicit casting .........................*/
         int p=10;
         int fp=p + (int)8.34;
         System.out.println("So after type conversion of 8.34 and additng it to p=10 : "+fp);

         /*................    constants by using final keyword  ..................*/
         final int a=43;
         // a=34;  error bcoz final means it is constant.we can't change the value of a.

         /*...................Math class.......................*/
         System.out.println("Large number is using Math class's function max between 388 and 933 is : "+Math.max(388,934));
         System.out.println("Number using Random function is :"+Math.random());
         System.out.println((int)(Math.random()*100));
         //random function of Math class is used to generate random float numbers


         /*................... Input in Java  .......................*/
         Scanner objScanner=new Scanner(System.in);
         System.out.println("ENTER one STRING");
         String str=objScanner.nextLine();
         //here Scanner is class we have made obj as objScanner 
         //and used next() method to take input 
         //next method for only first string 
         //String ster=objScanner.nextLine();         //for full line 
         System.out.println("ENTER ONE INT TYPE NO. AND ONE FLOAT NO.");
         int ak=objScanner.nextInt();
          float ft=objScanner.nextFloat();
          System.out.println(str+" "+ak+" "+ft);





    

    



        /*........................ Control statements in Java .........................*/

          boolean isAdult=true;
         if(isAdult){
            ///////here even we didn't write isAdult==true.
            //////still it automatically compares to true and when isAdult is true , block of if will be executed otherwise else block.
            System.out.println("he/she is adult");
            }
            else{
               System.out.println("not an adult");
            }
            // Variables that are declared inside loop they are only accessible inside the loop and we can't acces them 
            // outside the loop...
            int number;
            do{
            System.out.println("input a number");
            number=objScanner.nextInt();
             }while(number>=0);          // Note down that termination after while 
            // means we will exit from loop if user enter any negative number However loop will run till that



       
        /*........................---------2 D Arrays--------.............................. */
        //int[][] twodarr=new int[3][3];
        int[][] twodarr={{11,12,13},{21,22,23},{34,3,45}};
        //we can also initialise like this if we have values to initialise.but here we don't have to specify the size of array
        System.out.println("2_D Array would be : ");
        for(int k=0;k<3;k++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(twodarr[k][j]+" ");
            }
            System.out.println( );
        }





























        /*     ........................ Exception Handling in Java  .........................     */
         try//remember here try is not any method so don't type like this try() because it is keyword 
         {
            System.out.println("Enter float f or checking Exception handling ");
            float it=objScanner.nextInt();

         }
         catch(Exception obje)   //here generated exception is stored in object of Exception type
         {
            System.out.println(obje);
         }

         // we can access fields by class name if they are static.
         //for eg if we declare school with static keyword
         //then it is accessed as ClassName.school;
         //if we change school then it will be changed for every subclass
         






   
         /*........................ Interfaces .........................*/
        /*interface Animal
         {
            void walk();
            //here access specifier of walk() is public 
            ////all the fields in interfaces are public , static and final by default 
            /////ie
            int a=32;
            ///now i can't change the value of a in other classes
         }
         class Horse implements Animal
         {
            public void walk()    ///here public is needed because as walk() function is in interface so it is public by default.
            {
                sout("Walks on 4 legs");
            }
         }
         public class OOPs
         {
            psvm(String[] args])
            {
                
            }
         }
         */

         


         /*................................ StringBuilder class instead of String Class ........................... */

         //We are supposed to use StringBuilder class to create Strings if we need to perform add , 
         //delete operations on string that will take less time 
         StringBuilder sb=new StringBuilder("Hello");
         for(int it = 0;it<sb.length()/2;it++)   //loop will execute till its half size
         {
            int front =it;
            int back = (sb.length()-1)-it;
            //store frontChar and backChar
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            //we have two methods belonging to StringBuilder class
            sb.setCharAt(frontChar,backChar);
            sb.setCharAt(backChar,frontChar);
         }
         System.out.println(sb);         
    }
}
