package OOPS;

public class student {
    private String name="Kaju";
    private int age=20;

    public student(String name,int age){
        this.age=age;
        this.name=name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name)  {
        
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    // public void setAge(int age) throws Exception {
    //     if(age<0){
    //         throw new Exception("Age Negative Kaise Ho sakti hai bhai");
    //     }
    //     this.age = age;
    // }
    public void setAge(int age) {
        try{
            if(age<0){
                throw new Exception("Age Negative Kaise Ho sakti hai bhai");
                }
                this.age=age;
        }
        
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Wrong Input");

        }
        finally{
            System.out.println("I am in finally block");
            System.exit(4);
        }
    }
}
