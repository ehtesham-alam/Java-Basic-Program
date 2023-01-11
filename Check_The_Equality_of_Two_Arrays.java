import java.util.Arrays;

class Check_The_Equality_of_Two_Arrays {
    public static void main(String[] args) {
        int arr1[]= {2,4,8,3,4,6,8,7,5,1,3,8,0};
        int arr2[]= {2,4,8,3,4,6,8,7,5,1,3,8,0};
        
        boolean status = Arrays.equals(arr1, arr2);
        if (status==true){
            System.out.println("Array are equal");
        }
        else
            System.out.println("Array are not equal");
 }
}
