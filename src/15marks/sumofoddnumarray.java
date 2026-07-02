/* sum of odd numbers in the given array */
import java.util.*;
class sumofoddnumarray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%2!=0)
            {
                ans+=arr[i];
            }
        }
        System.out.println(ans);
    }
}