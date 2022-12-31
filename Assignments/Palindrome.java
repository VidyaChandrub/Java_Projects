class Palindrome{
    public static void main(String args[]){
        int number = 1232, reversed = 0,remainder=0;

        int originalnum = number;

        while(originalnum != 0){
            remainder = originalnum % 10;
            reversed = reversed*10 + remainder;
            originalnum/=10;
        }

        if(number == reversed){
            System.out.println("palindrome ");
        }
        else 
        {
            System.out.println("Not palindrome");
        }
    }
}