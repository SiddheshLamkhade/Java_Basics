class A
{
    A()
    {
        
        System.out.println("This is Constructor of class A");
    }
}
class B extends A
{
    B()
    {
        System.out.println("This is Constructor of class B");
    }
}
class C extends B
{
    C()
    {   
        System.out.println("This is Constructor of class C");
    }
}
class Inheritance{
    public static void main(String[] args)
    {
        C obj=new C();
    }
}