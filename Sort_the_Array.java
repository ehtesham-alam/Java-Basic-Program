import java.util.Arrays;
 
class Sorted_the_Array{
    public static void main(String[] args) {
     
     int arr[]= {34,43,22,15,2,98,12,25};
     System.out.println("The original array is: ");
     for(int i=0;i<=arr.length-1;i++){
         System.out.print(arr[i]+ " ");
     }
     Arrays.sort(arr);
     System.out.println("\nThe sorted array is: ");
     for(int i=0;i<=arr.length-1;i++){
         System.out.print(arr[i]+ " ");
    
    }
    
        
    }
}
