/* class Palindromestr{
    public static void main(String args[]){

        String str = "Radar", reversed="";

        int strlength = str.length();
        //System.out.println(strlength);

        for(int i=(strlength - 1);i>=0; i--){
            reversed=reversed + str.charAt(i);
        }

        //System.out.println(reversed);
        if(str.toLowerCase().equals(reversed.toLowerCase())){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
} */
