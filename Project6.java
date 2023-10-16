

class Employee{
        String name;
        String Address;
        int age;
        void Print()
        {
            System.out.println(this.Address);
            System.out.println(this.age);
            System.out.println(this.name);
        }
        
}
public class Project6 {
    public static void main(String[] args) {

        Employee e=new Employee();
        e.Address="Khanewal";
        e.age=12;
        e.name="Usama";
        e.Print();
        e.Print();
        Student s=new Student();
        s.CGPA=32;
        s.name="USama";
        s.STDinfo();


        
    }
}

class Student{
    String name;
    float CGPA;
    void STDinfo()
    {
        System.out.println(this.name);
        System.out.println(this.CGPA);
    }
}
