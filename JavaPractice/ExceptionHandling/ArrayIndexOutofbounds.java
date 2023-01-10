class ArrayIndexOutofbounds{
    public static void main(String args[]){

        int[] arr = new int[5];

        try{
            arr[6] = 2;
            System.out.println("rest of array");
        }
        catch(ArrayIndexOutOfBoundsException aio){
            System.out.println("Array index out of bounds");
        }
        catch(Exception e){
            System.out.println("Size exceeded");
        }
        
        
    }
}