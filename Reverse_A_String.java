import java.util.Scanner;

class Reverse_A_String {
    public static void main(String[] args) {
        String rev="";
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the String\n");
       String str= sc.nextLine();
       int len = str.length();
       System.out.println("Length of string "+len +"\n");
       for(int i=len-1;i>=0;i--){
           rev=rev+str.charAt(i);
        }
       System.out.println("Reverse String is "+ rev);
    }
}
