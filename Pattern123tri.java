public class Pattern123tri {
    
    void Pattern123(){

        for(int i =1;i<=5;i++)
        {
            {
            for(int k=5;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
        
        }
        System.out.println();
           
        }


    }

    public static void main(String []args)
    {
            Pattern123tri p = new Pattern123tri();
            p.Pattern123();
    }
}
