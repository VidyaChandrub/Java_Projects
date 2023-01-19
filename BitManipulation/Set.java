/* 
bitMask - 1 << i(position) 
operation - OR */

class Set{
    public static void main(String args[]){
        int num = 5;
        int position = 1;

        int  bitMask = 1 << position;
        int newNum = bitMask | num;

        System.out.println(newNum);
    }
}