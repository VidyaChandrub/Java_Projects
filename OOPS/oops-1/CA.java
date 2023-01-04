public class CA extends Account{
    private double min_Bal;

    public void setmin_Bal(double bal){
        this.min_Bal = bal;
    }

    public double getmin_Bal(){
        return min_Bal;
    }

     public void cal_Bal(){
        double balance = getacc_Amount();
        balance = balance - getmin_Bal();
        System.out.println(getacc_Name() + " : " + balance);
    }

}