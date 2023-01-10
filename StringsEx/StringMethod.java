public class StringMethod{
    public static void main(String args[]){
        String s1 = "Vidya";
        String s2 = "vidya";

        // s1 > s2 +ve
        // s1= s2 0
        //s1 < s2 -ve

        if(s1.compareTo(s2) == 0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}