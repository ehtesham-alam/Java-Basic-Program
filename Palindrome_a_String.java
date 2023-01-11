import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
       String rev="";
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the String\n");
       String str1= sc.nextLine();
       int len = str1.length();
       System.out.println("Length of string "+len +"\n");
       for(int i=len-1;i>=0;i--){
           rev=rev+str1.charAt(i);
        }
        String str2=rev;
        if(str1.equals(str2)){
            System.out.println("String is palindrome ");
        }
        else
        System.out.println("String is not palindrome ");
    }
}
