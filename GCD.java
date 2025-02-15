import java.util.*;
class GCD{
    public static int gcd(int a,int b){
        int minno=Math.min(a, b);
        for(int i = minno; i>=1;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int res=gcd(a,b);
        System.out.println(res);
        sc.close();
    }
}