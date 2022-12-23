class One{
    static int a;
    int b;

    public static void main(String args[]){
        One b1 = new One();
        int c = 10;
        //System.out.println(a);          //default value 0
        //System.out.println(b1.b);        //default value 0
        System.out.println(c);            //local variables must be initilized otherwise will throw compile-time error


    }
}