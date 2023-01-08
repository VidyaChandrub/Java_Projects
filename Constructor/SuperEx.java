// super is used to invoke parent class constructor
//super is also used to invoke parent class instance variables
//super is also used to invoke parent class method

class Animal{
    int a =10;
    Animal(){ 
        System.out.println("Animal constructor");
    }

    void eat(){
        System.out.println("Animal Eat method");
    }

}
class Dog extends Animal{
    int a=20;
    void printInt(){
        System.out.println(a);
        System.out.println(super.a);
    }
    
    Dog(){
        super();
        System.out.println("Dog constructor");
    }

    void eat(){
        super.eat();
        System.out.println("Dog Eat method");
    }

}
class SuperEx{
    public static void main(String args[]){
        Dog d = new Dog();
        d.printInt();
        d.eat();
    }
}