import java.util.Scanner;

public class Sum{
    public static void main(String[] args){
        int[] arr = {2,3,4,5,8,7,9,1};
        int sum = 0;
        double average = 0;

        for(int a : arr){
            sum = sum + a;
        }

        int arrLength = arr.length;

        average = (double)sum + (double)arrLength;

        System.out.println("Sum is :" + sum);
        System.out.println("Average is :" + average);
    }
}