public class Test{
    
    public String reverse(String name){
        String output = new String();
        for(int i=name.length()-1;i>=0;i--)
            output = output + name.charAt(i);
            return output;
        
    }
      
      
        public String modifyStr(String name){
            String str = "";
            for(int i=0; i<name.length();i++){
                int ascii = name.charAt(i);
                if(ascii == 122){
                    ascii = 97;
                }
                else if(ascii == 90){
                    ascii = 65;
                }
                else{
                    ascii++;
                }
                char temp = (char)ascii;
              
                str = str +temp;
                 
            }
           
            return str;
            
        }
       
       public static void main(String args[]){
        String name = "ABDEF";
    
        int ascii = name.charAt(0);
        ascii++;
        char temp = (char)ascii;
}
}


