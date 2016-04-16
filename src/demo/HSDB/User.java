package demo.HSDB;

public class User {
    public static void main(String[] args) {
    	User1 user = new User1(27,"chujinhui");

        System.out.println("");
    }
}

class User1{
    private int age;
    private String name;

    public User1(int age,String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}