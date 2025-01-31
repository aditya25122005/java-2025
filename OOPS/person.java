package OOPS;

public class person {
   private String name="akash";
   private int age=25;
    public person(){

    }
    public person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    
}
