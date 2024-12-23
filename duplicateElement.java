public class duplicateElement {

    public static void main(String[] args){

        int arr[] ={12,34,56,71,34,45};
        boolean flag = false;

        for(int i =0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            flag=true;
            
        }
        System.out.println("Duplicate element found  ");
        
    }
    
}
