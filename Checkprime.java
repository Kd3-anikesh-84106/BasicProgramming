import java.util.Scanner;

public class Checkprime {

    public static void main(String args[]){
       
        int N;

        System.out.println("Enter a Number to check for Prime");

        Scanner sc = new Scanner(System.in);

        N= sc.nextInt();

        System.out.println("Entered No. is :"+N);

        int count=0;
        for(int i=1;i<=N;i++)
        {
            if(N%i==0)
            count++;
        }
        if(count==2)
        System.out.println("The input No.=" +N+ "is prime No");
        else
        System.out.println("It is not a prime No.");
    }
    
}
