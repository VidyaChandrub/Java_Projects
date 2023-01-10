class NullPointer{
    public static void main(String args[]){
        String s = null;
            try{
                System.out.println(s.length());
            }
            catch(NullPointerException a){
                System.out.println("null");
            }
            catch(Exception e){
                System.out.println(0);
            }
            
        
    }
}