import java.util.Scanner;

public class SumPrime {
    public static void main(String args[])
    {   
        
        System.out.println("Enter a Number you want to get sum of Prime No");
        Scanner sc = new Scanner(System.in);
        int Num=sc.nextInt();
            int sum =0;
        for(int i=1;i<=Num;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
                
            }
            if(count==2)
                sum=sum+i;
               
        }
        System.out.println(sum);
    }
}
