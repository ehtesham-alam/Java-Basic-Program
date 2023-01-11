import java.util.Arrays;

class Minimum_Number {
    public static void main(String[] args) {
        int min=0;
        
     
     int arr[]={4,3,9,6,1,2,5,8};
      min=arr[0];
      for(int i=0;i<=arr.length-1;i++){
          if(arr[i]<min){
          min=arr[i];
          }
        }
        System.out.println(min);
        
    }
}
