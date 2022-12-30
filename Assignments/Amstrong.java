class Amstrong{
    public static void main(String args[]){
        int number = 153, remainder,original, result=0;
        original = number;

        while(original != 0){
            remainder = original % 10;
            result += Math.pow(remainder, 3);
            original /= 10;
        }

        if(result == number){
            System.out.println(result + "Amstrong");
        }
        else{
            System.out.println(result+"Not Amstrong");
        }
    }
}

