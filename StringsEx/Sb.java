class Sb{
    public static void main(String args[]){

        StringBuilder sb = new StringBuilder("Vidya");
        System.out.println(sb);

        sb.setCharAt(0,'B');
        System.out.println(sb);

        sb.insert(0,'C');
        System.out.println(sb);

        sb.insert(3,'y');
        System.out.println(sb);

        // sb.delete(3,4);
        sb.delete(3,5);
        System.out.println(sb);

    }
}