/* Count lowercase letters string */
import java.util.*;
class countlowercase
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLowerCase(s.charAt(i)))
            {
                ans++;
            }
        }
        System.out.println(ans);
    }
}