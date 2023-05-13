import java.util.*;
import java.util.Scanner;
class P_greatest
{
    public static void main(String[] args)
    {
        int a[] = new int[100];
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:");
        n=sc.nextInt();
        System.out.println("enter the array elements:");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=1;i<n-1;i++)
        {
            if(a[i]>a[i-1]&&a[i]>a[i+1])
            {
                System.out.println("the P element is "+a[i]);
            }
        }
    }
}