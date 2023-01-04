public class Account extends Bank{

    private int acc_Id;
    private String acc_Name;
    private double acc_Amount;

    public void cal_Bal(){

    }

    //setters and getters

    public void setacc_Id(int id){
        this.acc_Id = id;
    }

    public int getacc_Id(){
        return acc_Id;
    }

    public void setacc_Name(String name){
        this.acc_Name = name;
    }

    public String getacc_Name(){
        return acc_Name;
    }

    public void setacc_Amount(double amt){
        this.acc_Amount = amt;
    }

    public double getacc_Amount(){
        return acc_Amount;
    }
}