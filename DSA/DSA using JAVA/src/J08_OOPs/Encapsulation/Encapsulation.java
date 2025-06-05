package J08_OOPs.Encapsulation;

class Student{
    //wrapping up data & methods under a single unit; it also implements data hiding
    private String name;
    private int rollNo;
    private int age;
    Student(){
        System.out.println("A new Student is Registered");
    }
    Student(int rollNo, String name, int age){
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }
    // setters
    public void setName(String name) {this.name = name;}
    public void setRollNo(int rollNo){this.rollNo = rollNo;}
    public void setAge(int age) {
        if(age > 0)
            this.age = age;
        else
            System.out.println("Age cannot be Negative!!!");
    }
    // getters
    public int getRollNo(){ return rollNo; }
    public int getAge() { return age; }
    public String getName(){ return name; }

    public void printDetails(){
        System.out.println("Details are: ");
        System.out.println("Name: " + this.name);
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("Age: " + this.age);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student stud1 = new Student(101, "Anand", 25);
        stud1.setAge(30);
        stud1.printDetails();
    }
}
