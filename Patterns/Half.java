/* Half pyramid */
/* class Half{
    public static void main(String args[]){
        int n = 5;
        
            for(int i=1; i<=n; i++){
              for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
} */

/* Inverted Half */
class Half{
    public static void main(String args[]){
        int n = 5;
        
            for(int i=n; n<=i; i--){
              for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}