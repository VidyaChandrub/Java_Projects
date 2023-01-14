class WC{
    public static void main(String args[]){
        int a = 10;

        Integer i = Integer.valueOf(a); // converting primitive datatype to object explicitly
        Integer j = a; // autoboxing -compiler internally convert

        System.out.println(a);
        System.out.println(j);
        System.out.println(i);

        Integer b=new Integer(3);  
        int k = b.intValue();  //explicit
        int l = b; // unboxing

        System.out.println(b);
        System.out.println(k);
        System.out.println(l);
    }
}