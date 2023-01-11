import java.util.Scanner;

class count_even_and_odd_digit {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number\n");
       int num= sc.nextInt();
       int even_count=0;
       int odd_count=0;
       
          while(num>0){
           int remainder=num%10;
           
           if(remainder%2==0)
          even_count++;
          
          else
          odd_count ++;
          
          num=num/10;
          }
          
        System.out.println(even_count+"\n");
        System.out.println(odd_count+"\n");
        
    }
}
