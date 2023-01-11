class Swap two number without using third variable{
    public static void main(String[] args) {
     int a,b;
     a=10;
     b=20;
     System.out.println("Value of a before Swaping is "+ a +" Value of b before Swaping is "+b);
     a=a+b;
     b=a-b;
     a=a-b;
    
    System.out.println("Value of a after Swaping is "+ a +" Value of b after Swaping is "+b);
    }
}
