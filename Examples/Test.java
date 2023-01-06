class Student{
    int rollNo;
    String name,course;
    float fee;

    Student(int rollno, String name, String course){
        this.rollNo = rollno;
        this.name = name;
        this.course = course;
    }

    Student(int rollno,String name,String course,float fe){
        this(rollno,name,course);
        this.fee = fe;
    }

    void display(){
        System.out.println(rollNo + " " + name + " " + course + " "+ fee);
    }

}

class Test{
    public static void main(String args[]){
        Student s1 = new Student(101,"vidya","emcs");
        Student s2 = new Student(101,"vidya","emcs",45000.00f);
        s1.display();
        s2.display();
    }
}