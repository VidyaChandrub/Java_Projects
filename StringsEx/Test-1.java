class Test{
    public static void main(String args[]){


        String ename = "Vidya";  // create an reference in String constant pool(SCP)
        ename = ename.concat("Chandru");
        System.out.println(ename); // Vidya

        String ename1 = new String("Vidya"); // reference is created in heap memory and SCP
        ename1.concat("Chandru");
        System.out.println(ename1);

        StringBuffer ename2 = new StringBuffer("Vidya"); // reference is created in heap memeory only
        ename2.append("Chandru");
        System.out.println(ename2);
        
        StringBuilder ename3 = new StringBuilder("Vidya"); // reference is created in heap memeory only
        ename3.append("Chandru");
        System.out.println(ename3);
        

    }
}