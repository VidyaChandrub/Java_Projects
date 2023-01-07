class Bank{
    int getRateOfInterest(){
        return 0;
    }
}
class Sbi extends Bank{
    int getRateOfInterest(){
       return 8;
    } 
}

class Icici extends Bank{
   int getRateOfInterest(){
        return 7;
    }  
}
class Kotak extends Bank{
    int getRateOfInterest(){
        return 9;
    } 
}
class TestBank{
    public static void main(String args[]){

        Sbi s = new Sbi();
        Icici i = new Icici();
        Kotak k = new Kotak();

        System.out.println(s.getRateOfInterest());
        System.out.println(i.getRateOfInterest());
        System.out.println(k.getRateOfInterest());
    }
}