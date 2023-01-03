class Employee{
    void m1(){
        System.out.println("Zero args");
    }

    void m1(int a){
        System.out.println("One args");
    }

    void m1(int b,int c){
        System.out.println("two args -with both int");
    }

    void m1(int d,float e){
        System.out.println("two args ");
    }

    void m1(double f){
        System.out.println("Double args");
    }

    void m1(float g){
        System.out.println("Float args");
    }

    void m1(String name){
        System.out.println("String");
    }

}


class Test{
    public static void main(String args[]){
      Employee e = new Employee();

      e.m1();
      e.m1(10);
      e.m1(10,20);
      e.m1(10,29.00f);
      e.m1(1000.00);
      e.m1(40.00f);
      e.m1("Vidya");
    }
}