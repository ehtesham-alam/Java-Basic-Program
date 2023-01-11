import java.util.Scanner;

class Largest_Number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
          System.out.println("Enter the Number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b&&a>c){
            System.out.println("A is greater among them");
        }
        else if(b>a&&b>c){
            System.out.println("B is greater among them");
        }
        else 
        System.out.println("C is greater among them");
          
    }
}
