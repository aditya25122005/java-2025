package OOPS;

public class person_client {
    public static void main(String[] args) {
        person p=new person();
        // System.out.println(p.name);
        // System.out.println(p.age);
        person p1=new person("Raman", 20);
        // System.out.println(p1.name);
        // System.out.println(p1.age);
        // p1.age=-90;
        // System.out.println(p1.age);
        System.out.println(p1.getAge());  //20
        p1.setAge(80);
        System.out.println(p1.getAge());  //80

        p1.setName("Parikh");
        System.out.println(p1.getName());
        p.setAge(30);
        System.out.println(p.getAge());
    
    }
}
