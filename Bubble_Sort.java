import java.util.Arrays;

class Bubble_Sort {
    public static void main(String[] args) {
        int arr[]= {2,4,6,8,10,1,3,5,7,9};
       System.out.println("Array Before Swapping "+Arrays.toString(arr));
        // Arrays.toString(arr) for printing the array
        int n =arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
             if(arr[j]>arr[j+1])
             {
                 int temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
             }
             
            }
        }
        System.out.println("Array Before Swapping "+Arrays.toString(arr));
        
        
        
    }
}
