/* This is sum of all digits in the given number Question */
import java.util.*;
class Sumofdigits
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans=0;
        while(n>0)
        {
            ans+=(n%10);
            n/=10;
        }
        if(ans%3==0)
        {
            System.out.print("True");
        }
        else {
            System.out.print("False");
        }
        sc.close();
    }
}
