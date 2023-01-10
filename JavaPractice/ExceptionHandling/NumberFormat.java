public class NumberFormat{
    public static void main(String args[]){

        int i;
        
         try{
            i = Integer.parseInt("ten");
           
        }
        catch(NumberFormatException a){
            i = 2;
        }
        catch(Exception e){
            i = 3;
        }
        finally{
            System.out.println("mandatory code");
        }
        
         System.out.println(i);
    }
}