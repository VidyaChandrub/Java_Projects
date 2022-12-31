
interface Testinterface{
     public abstract void insertRecords(); 
     // by default every method is public and abstract
     void setData();
}

class Implementation implements Testinterface{
    public void insertRecords(){
        System.out.println("Successfully inserted");
    }
    public void setData(){
        System.out.println("Successfully setting data");
    }
}
class Test{
    public static void main(String args[]){
        Implementation t = new Implementation();
        t.insertRecords();
        t.setData();
    }
}