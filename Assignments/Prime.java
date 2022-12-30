class Prime{
    public static void main(String args[]){
        int num=6,i=2;
        boolean flag = false;

        while(i <= num/2){
            if(num%2==0){
                flag =true;
                break;
            }
            i++;
        }

        if(!flag){
            System.out.println("Prime");
            }
            else{
             System.out.println("Not Prime");   
            }
    }
}