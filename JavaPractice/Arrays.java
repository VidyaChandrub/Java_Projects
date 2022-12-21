class Arrays{
    public static void main(String args[]){
       /*  Ways to declare array
        int[] a; 
        int a[];
        int []a; */

        int[] a;

        a = new int[5]; //Creating array

        a[0] = 2; //Initializing a array
        a[1] = 3;
        a[2] = 4;
        a[3] = 5;
        a[4] = 6;
       /*  a[5] = 7; */

        System.out.println(a.length);
        System.out.println(a[0]);

        char[] b = {'y','n'};
        System.out.println(b.length);
        System.out.println(b[0]);
        System.out.println(b[1]);

        String[] enames={"vidya","chandhu","prassu","ashok","teju","bharu"};
        System.out.println(enames.length);
        for(String ename : enames){
            System.out.println(ename);
        }
        

        byte[] c = {};
        System.out.println(c.length);





    }
}