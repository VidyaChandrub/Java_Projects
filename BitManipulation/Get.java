/* 
1 - Get bit -  for checking the given bit is 1 or 0 at th e given position
2 - Set bit -  for setting the bit either 0 to 1 or 1 to 1 
3 - Clear bit - for setting the bit to either from 0 to 0 or 1 to 0
4 - Update bit - for updating the bit either fro 0 to 1 or 1 to 0 */

/* For getting the bit at given position
bit mask - 1 << i(given position)
operation - And */

class Get{
    public static void main(String args[]){

        int num = 5; //0101
        int position = 3; 

        int bitMask = 1 << position;  // left shift by 3

        if((bitMask & num) == 0){
            System.out.println("bit was zero");
        }
        else{
            System.out.println("bit was one");
        }




    }
}