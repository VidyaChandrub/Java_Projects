/* 
bitMask - 1 << i(position) 
operation - OR */

class Set{
    public static void main(String args[]){
        int num = 5;
        int position = 3;

        int  bitMask = 1 << position;

        if((bitMask | num) == 0){
            System.out.println("Set to zero");
        }
        else {
             System.out.println("Set to one");
        }
    }
}