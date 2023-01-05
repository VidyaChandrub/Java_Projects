import java.util.Scanner;
class Transpose{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] transpose = new int[rows][cols];

        //input
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                transpose[i][j]=sc.nextInt();
            }
        }

        //output
        for(int j=0; j<cols; j++){
            for(int i=0; i<rows; i++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}