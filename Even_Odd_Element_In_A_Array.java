class Even_Odd_Element_In_A_Array {
    public static void main(String[] args) {
        int arr[]= {2,4,8,3,4,6,8,7,5,1,3,8,0};
        int even_count=0;
        int odd_count=0;
        for( int i=0;i< arr.length;i++){
           if(arr[i]%2==0){
          even_count++;
           }
          else{
          odd_count++;
          }
        }
        System.out.println(even_count);
        System.out.println(odd_count);
    }
}
