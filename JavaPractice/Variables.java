class Variables{
    int b = 80; //instance variables

    static int c=30;

    public static void main(String args[]){

        Variables v1 = new Variables();
        Variables v2 = new Variables();

        int a = 10; //local variables
        System.out.println(a);

        

        System.out.println(v1.b);
        System.out.println(v1.c);

        System.out.println(a+v1.b+v1.c);
        System.out.println(a+v2.b+v2.c);

        System.out.println(c);
        System.out.println(Variables.c);
        System.out.println(v2.b);
        System.out.println(v2.c);

        v2.b = 300;

        System.out.println(a+v1.b+v1.c);
        System.out.println(a+v2.b+v2.c); 
        
        v1.c = 100;

        System.out.println(a+v1.b+v1.c);
        System.out.println(a+v2.b+v2.c);
    }
}