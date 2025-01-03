import java.util.Scanner;

public class PrintNprimeNo {

    public static void main(String args[])
    {
        int n,i,count;

        System.out.println("Enter a number upto which you want to print a prime no");

        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
     
        //System.out.println(n);

        for(i=1 ;i<=n;i++)
        {
            count=0;
            for(int j=1;j<=i;j++)
            {
              
                if(i%j==0)
                {
                    count++;

                }
               
            }
            if(count==2)
            System.out.println(i);
        }
      
        
    }
    
}
