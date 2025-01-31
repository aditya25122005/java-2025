package OOPS;

public class student_client {
    public static void main(String[] args)  {
        student s=new student("Raj", 19);
        System.out.println(s.getAge());
        s.setAge(-9);
        System.out.println(s.getAge());

    }
}
