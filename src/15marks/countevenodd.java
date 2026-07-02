/* count no of odd and even numbers in the array*/
import java.util.*;
class countevenodd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        int odd=0;
        int even=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%2==0)
            {
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.print("Odd = "+odd+"\nEven = "+even);
    }
}