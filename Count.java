import java.util.Arrays;
public class Count {
    
    public static void main(String[] args){

     String str = "I am learning Java. And java  got some new versions";
     int count=0;
     str.trim();

     for(int i=0;i<str.length();i++)
     {
        if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
        count++;
     }
     count++; //to include the last word

    System.out.println("The count od words are "+count);     
    }
}
