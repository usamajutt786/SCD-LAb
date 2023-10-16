

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
        Student s=new Student(12,"Usama");
        s.STDinfo();
        Student s3=new Student(s);
        s3.STDinfo();
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
    Student(){}
    Student(Student s)
    {
        this.CGPA=s.CGPA;
        this.name=s.name;
    }
    Student(int CGPA,String name)
    {
         this.CGPA=CGPA;
         this.name=name;
    }

}
