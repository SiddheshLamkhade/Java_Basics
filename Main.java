class TempClass{
    int a=3;
    int fun(int j,int b)
    {
        System.out.println(j+"  "+b);
        j=89;
        return 4;
    }

}
public class Main
{
    public static void main(String[] args)
    {
        TempClass obj=new TempClass();
        int k=32;
        int t=323;
        int c=obj.fun(k,t);
        System.out.println(c);
        System.out.println("This is the value of j and b : "+k+"  "+t);
    }
}