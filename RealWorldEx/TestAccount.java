class Account{
    int acc_No;
    String acc_Name;
    double acc_Amt;

    public void insertRecord(int id,String name,double amt){
        this.acc_No = id;
        this.acc_Name = name;
        this.acc_Amt = amt;
    }

    //deposit

    public void deposit(double amt){
        this.acc_Amt = this.acc_Amt + amt;
        System.out.println(amt + " Deposited");
    }

    //withdraw

    public void withdraw(double amt){
        if(this.acc_Amt < amt){
            System.out.println("Insufficient Balance");
        }
        else
        {
            this.acc_Amt = this.acc_Amt - amt;
            System.out.println(amt + " Withdrawn");
        }
    }

    public void checkbal(){
        System.out.println("Balance is" + acc_Amt);
    }

    public void display(){
        System.out.println(acc_Name + " : " + acc_Amt);
    }
}

class TestAccount{
    public static void main(String args[]){

        Account a1 = new Account();
        a1.insertRecord(101,"Vidya",40000);
        a1.display();
        a1.deposit(15000);
        a1.checkbal();
        a1.withdraw(5000);
        a1.checkbal();
        a1.display();
    }
}