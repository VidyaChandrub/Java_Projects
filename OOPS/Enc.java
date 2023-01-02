 class Employee{                    // Encapsulated class
    private int eId;
    private String eName;

    public void seteId(int id){     // setter method
        this.eId = id;
    }

    public int geteId(){            // getter method to access private variables outside the class - in order to obtain hide variables
        return eId;
    }

    public void seteName(String name){
        this.eName = name;
    }

    public String geteName(){           
        return eName;
    }


}
 public class Enc{
    public static void main(String args[]){

        Employee e1 = new Employee();
        e1.seteId(101);
        e1.seteName("Vidya");
        System.out.println(e1.geteId());
        System.out.println(e1.geteName());


        Employee e2 = new Employee();
        e2.seteId(102);
        e2.seteName("Prasanna");
         System.out.println(e1.geteId());
        System.out.println(e2.geteName());
    }
}