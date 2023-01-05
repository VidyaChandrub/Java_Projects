import java.util.Scanner;

class Test{

    public static void main(String args[]){

       /*  String[] names = {"Vidya", "Chandru", "Bharu","Sandya","Padma"};

        for(int i=0; i<=names.length; i++){
            System.out.println(names[i]);
        } */

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String[] names = new String[size];

        for(int i=0; i<size; i++){
            names[i] = sc.next();cls
        }

        for(int i=0; i<size; i++){
            System.out.println(names[i]);
        }
    }
}