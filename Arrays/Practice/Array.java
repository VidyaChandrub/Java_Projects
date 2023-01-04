import java.util.Scanner;
class Array{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        // int[] marks = new int[3];
        int[] marks = new int[size];
        

        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 99;

        // System.out.println(marks);

        /* System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]); */

        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        

    }
}