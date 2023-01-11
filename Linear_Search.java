import java.util.Arrays;
import java.util.Scanner;
class Linear_Search{
    public static void main(String[] args) {
        
        int arr[]= {24,543,23,212,46,76,12,9,87};
        Scanner sc= new Scanner(System.in);
        boolean flag=false;
        System.out.println("Enter the Number ");
        int x= sc.nextInt();
        for(int i =0;i<arr.length;i++){
            if( x==arr[i]){
            System.out.println(i);
            flag=true;
            break;
                
            }
        }
            if(flag==false)
            System.out.println("-1");
    }
}
