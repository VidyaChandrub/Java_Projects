public class Test{
    public static void main(String args[]){

         SA s1 = new SA();

        s1.setacc_Id(101);
        s1.setacc_Name("Vidya");
        s1.setacc_Amount(5000.00);
        s1.setmin_Bal(500.00);
        //s1.cal_Bal();
        Account_Ser.get_Account(s1);

         CA c1 = new CA();

         c1.setacc_Id(102);
         c1.setacc_Name("Prasana");
         c1.setacc_Amount(6000.00);
         c1.setmin_Bal(500.00);
         //c1.cal_Bal();
         Account_Ser.get_Account(c1);
    }
}