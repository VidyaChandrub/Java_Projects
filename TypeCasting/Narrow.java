/* Narrow casting - must be done manually -converting higher datatype to smaller datatype */

class Narrow{
    public static void main(String args[]){

        double myDbl = 10.99;
        int myInt = (int)myDbl;

        System.out.println(myDbl);
        System.out.println(myInt);
    }
}