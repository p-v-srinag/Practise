/* check given number is palindrome or not */
import java.util.*;
class palindrome
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int o = n;
        int r=0;
        while(n>0)
        {
            int d=n%10;
            r=r*10+d;
            n/=10;
        }
        System.out.println(o==r);

    }
}