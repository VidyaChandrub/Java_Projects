// Exception an unexpected event occured in the program that stops the program abnormally.Therefore we need to predict the expection and handle it.
//Exceptions are of two types Checked(checked by compiler when there is any thirdparty file or data from database //CE ) and Unchecked exception(unchecked by compiler //RE)
//We can handle exception using try(Risky code or exception we are expecting), catch(code to handle exception), finally(mandatory code),throw(instead of try catch) and throws(customise exceptions)

public class Test{

    public static void main(String args[]){

        System.out.println("GM");
        try{
            System.out.println(10/0);   // runtime error
        }
        catch(Exception e){
            System.out.println(10/2);
        }
         
        System.out.println("GN");
        
    }

}