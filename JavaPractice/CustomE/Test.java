class InusufficientFundsException extends Exception{
    InusufficientFundsException(String message){
        super(message);
    }
}
class Account {
    public void withdraw() throws InusufficientFundsException{
        int amt = 400;
        if(amt < 500){
            throw new InusufficientFundsException("No money !");
        }
        else{
            System.out.println("Enjoy");
        }
        
    }
}
class Test{
    public static void main(String args[]) throws InusufficientFundsException{
      Account a  = new Account();
      a.withdraw();
    }
}