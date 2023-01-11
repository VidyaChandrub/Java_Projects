class ThrowEx{
    public static void validate(int age){
        if(age < 18){
            throw new ArithmeticException("Not eligible to vote");
        }
        else{
            System.out.println("Eligible to vote");
        }
    }
    public static void main(String args[]){

        //System.out.println(10/0);
        //throw new ArithmeticException("throwing exception");
        validate(13);
    }
}