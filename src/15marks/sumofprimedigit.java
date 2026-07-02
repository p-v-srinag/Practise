
/* sum of all prime digits in the array*/
import java.util.*;
class sumofprimedigit
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans=0;
        while(n>0)
        {
            int t=n%10;
            n/=10;
            if(t==2||t==3||t==5||t==7||t==9)
            {
                ans+=t;
            }
        }
        System.out.println(ans);
    }
}