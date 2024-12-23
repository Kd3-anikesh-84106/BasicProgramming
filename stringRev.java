import java.util.Scanner;

class stringRev{

    public String stringRev(String str){

        int length = str.length();
        char[] ch = str.toCharArray();
        for(int i = length-1;i>=0;i--)
        {

            System.out.print(ch[i]);
        }
      
        return str;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
       stringRev p = new stringRev(); 

        p.stringRev(s);

    }
}