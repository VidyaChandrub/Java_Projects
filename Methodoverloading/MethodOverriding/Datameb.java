// Runtime polymorphism cannot be achieved by datamembers (variables )
class Bike{
    int speedlmt = 90;
}

class Datameb extends Bike{
    int speedlmt = 120;

    public static void main(String args[]){
        Bike b = new Datameb();

        System.out.println(b.speedlmt);
    }
}