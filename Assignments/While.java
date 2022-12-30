import java.util.Scanner;
/* class While{
    public static void main(String args[]){
        int i=1;
        while(i <= 5){
            if(i%2==0 && i%3==0 && i%5==0){
                System.out.println(i);  
                i++;
            }
          
        }
       
    }
} */

/* class While{
    public static void main(String args[]){
        
        for (int num = 0; num < 100; num++)
        {    
            
            if (num % 3 == 0 && num % 5 == 0)
                System.out.print(num + " ");
        }
       
    }
} */

/* class While{
    public static void main(String args[]){
       int temp;
       int number=524287;

       for(int i=1; i<=number;i++){
        if(number%2 == 0){
            temp=2;
            number=number/2;
        }
       }

       if(number%)
        
    }
}
 */

/*  class While{
    public static void main(String args[]){
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }
 } */

  /* class While{
    public static void main(String args[]){
        int i=10;
        while(i>=1){
            System.out.println(i);
            i--;
        }
    }
 } */

 /* class While{
    public static void main(String args[]){
        for(int i=5; i<=15; i++){
            System.out.println(i);
        }
    }
 } */

 /* class While{
    public static void main(String args[]){
        for(int i=15; i>=10; i--){
            System.out.println(i);
        }
    }
 } */

 /* class While{
    public static void main(String args[]){
        int i = 1;
        while(i <= 10){
            if(i%2 == 0)
                System.out.println(i);
                i++;
        }
    }
 } */

 /* class While{
    public static void main(String args[]){
        int i = 2;
        while(i<=10){
         System.out.println(i);
               i= i+2;   
        }

    }
 } */

 /* class While{
    public static void main(String args[]){
       int i=1;
       while(i<=10){
           if(i % 2!=0)
                continue;
           System.out.println(i);
           i++;
       }
    }
 } */

 /* class While{
    public static void main(String args[]){
        for(int i=1; i<=10; i++){
            if(i%2 == 0)
            continue;
            System.out.println(i);
        }
    }
 } */

 /* class While{
    public static void main(String args[]){
        int i=1;
        while(i<=10){
            System.out.println("4 * "+ i + " = " + 4*i);
            
            i++;
        }
    }
 } */

 /* class While{
    public static void main(String args[]){
        int i=1;
        while(i<=10){
            System.out.println("6 * "+ i + " = " + 6*i);
            i++;
        }
    }
 } */

 /* class While{
    public static void main(String args[]){
        int factor = 24;
        int i , count = 0;

        for(i=1; i<=factor; i++){
            if(factor % i == 0){
                count = count+1;
                System.out.println(i);
            }
        }
       System.out.print("\nTotal factors of"  + factor + " : " + count);
    }
 }  */

 /* class While{
    public static void main(String args[]){
        int num = 187 ,reversed =0;
        while(num != 0){
            int rem = num% 10;
            reversed = reversed*10 + rem;
            num/=10;
        }
        System.out.println(reversed);
    }
 } */

 /* class While{
    public static void main(String args[]){
        int[] a = {2,4,5,7,8};
        

        for(int i=0;i<=a.length;i++){
            if(a[i] % 2==0){
                System.out.println(a[i]);
            }
        }
    }
 } */

/*  class While{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        int c=0;
        for(int i=1;i<=num;i++){

            c = a+b;
            System.out.println(c);
            a =b;
            b=c;
        }
    }
 } */

  class While{
    public static void main(String args[]){
        int num = 17;
        int a = 0;
        int b = 1;
        int c=0;

            while(a <= num){
                System.out.println(a + " ");
            c = a+b;
            a = b;
            b = c;
            }
            
    }
 }