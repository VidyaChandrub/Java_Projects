class Bike{
    void run(){
        System.out.println("Bike running");
    }
}

class Splendor extends Bike{
    void run(){
        System.out.println("Splendor running");
    }
    
    public static void main(String args[]){

        Bike b = new Splendor();
        b.run();
    }
}