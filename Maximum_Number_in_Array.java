import java.util.Arrays;

class Maximum_Number {
    public static void main(String[] args) {
        int max=0;
        int min=0;
        
     
     int arr[]={1,4,3,9,6,1,2,5,8};
      max=arr[0];
      for(int i=0;i<=arr.length-1;i++){
          if(arr[i]>max){
          max=arr[i];
          }
        }
        System.out.println(max);
        
    }
}
