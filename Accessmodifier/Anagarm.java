import java.util.*;

class Anagram{
    public static void main(String args[]){
        
        String s1 = "Army";
        String s2 = "mary";

        /* int srt1 = s1.length();
        int str2 = s2.length(); */

        if(s1.length() == s2.length()){
            char[] arrs1 = s1.toLowerCase().toCharArray();
            char[] arrs2 = s2.toLowerCase().toCharArray();

             Arrays.sort(arrs1);
             Arrays.sort(arrs2);

           boolean result = Arrays.equals(arrs1,arrs2);

            if(result){
            System.out.println("Two strings are anagram");
        }
        else{
            System.out.println("Two strings are not anagram");
        }
        }

         

        

    }
}