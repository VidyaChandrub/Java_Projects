class Arithmatic{
    public static void main(String args[]){
        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);
        System.out.println(20 / 10);
        System.out.println(20 % 10);
        System.out.println(10 / 0);     //run time exception doesn't give infinity
        System.out.println(10 / 0.0);   //gives infinity
        System.out.println(0 / 0.0);    //NaN
    }
}