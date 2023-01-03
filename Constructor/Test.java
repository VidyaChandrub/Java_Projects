class Employee{

    int eId;
    String eName;

    Employee(){   // default constructor
        System.out.println("Default constructor");
    }

    Employee(int id, String name){
        this.eId = id;
        this.eName = name;

    }

    public void m1(){
        System.out.println("Normal method");
    }
}

class Test{
    public static void main(String args[]){
          Employee e = new Employee();
          Employee e1 = new Employee(101,"Vidya");
          
          System.out.println(e1.eId);
          System.out.println(e1.eName);
          e1.m1();


    }
}