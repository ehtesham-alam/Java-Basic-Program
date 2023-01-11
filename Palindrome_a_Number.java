import java.util.Scanner;

class Palindrome_a_Number {
    public static void main(String[] args) {
       int rev=0;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number\n");
       int num1= sc.nextInt();
       int compare_number=num1;
      while(num1!=0){
           rev=rev*10 + num1%10;
           num1=num1/10;
          }
      System.out.println("\n"+rev);
        
        int num2=rev;
        if(compare_number == num2){
            System.out.println("Number is palindrome ");
        }
        else
        System.out.println("Number is not palindrome ");
    }
}
