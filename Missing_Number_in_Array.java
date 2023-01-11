class Missing_Number {
    public static void main(String[] args) {
        int sum1=0;
        int sum2=0;
        int diff=0;
     
     int arr[]={1,2,3,5,6,7,8};
      for(int i=0;i<=arr.length-1;i++){
         sum1=sum1+arr[i];
        }
        for(int j=1;j<=8;j++){
            sum2=sum2+j;
        }
         diff=sum2-sum1;
         
         
     
    //   System.out.println(sum1);
    //   System.out.println(sum2);
      System.out.println("Missing Number is "+diff);
    }
}
