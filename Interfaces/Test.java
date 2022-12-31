interface Testinterface{
    public static final int x = 26;  // by default every varibale is public static and final
}

class Test implements Testinterface{
    public static void main(String args[]){
        System.out.println(x);
    }
}