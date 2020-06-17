import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);    
        int n=sc.nextInt();
        int x=sc.nextInt();
        int a=sc.nextInt();
        int q=n*x;
        int c=0;
        for(int i=0;i<n||n<i;i=i+a/x)
                {
                if(x==a)
                    c=n;
                else{
                  n=n-a/x;
                  c++;
                  if(n<=0)
                    break;
                    }
                }
                
    System.out.println(c);
    }
}