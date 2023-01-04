class Varargs{

    public static void add(int... x){
        int sum = 0;
       for(int value : sum){
            System.out.println(value);
       }
        
    }
    public static void main(String args[]){

        add();
        add(10,20);
        add(10,20,30);

    }
}