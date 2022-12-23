class Anynmos{
    public static void main(String args[]){
        //Cal_marks(10,20);
        Cal_marks(new int[] {100,100,100,100});

    }

    //public static void Cal_marks(int a,int b)
    public static void Cal_marks(int[] marks){
        int total= 0;
        for(int mark : marks){
            //System.out.println(mark);

            //total = total + mark; assignment operator

            total += mark;
            System.out.println(total);

        }

        
    }
}