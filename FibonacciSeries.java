class Fibonacci_sequence{
    public static void main(String[] args) {
     int n1 = 0;
     int n2 = 1;
     
      System.out.print("0 1 ");
     for(int i=2;i<=10;i++){
         int sum = n1 + n2;
         System.out.print(sum+" ");
         
         n1=n2;
         n2=sum;
     }
    
    }
}
