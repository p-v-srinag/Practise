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
/* for string 2 pointer approch*/
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(ispalendrome(s));
    }
    public static boolean ispalendrome(String s)
    {
        if(s==null)
        {
            return false;
        }
        s=s.toLowerCase();
        int left = 0;
        int right=s.length()-1;
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
