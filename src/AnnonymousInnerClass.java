class A2
{
    int rollno;
    String sname;
}
public class AnnonymousInnerClass{
    public static void main(String[] args) {
        B2 obj1=new c();// this is a polymorphism (parent can store the reference of the child class
        obj1.show();
    }
}
class B2
{
    public void show()
    {
        System.out.println("hello");
    }
}
class c extends B2{// here we are using the inheritance
    public void show()
    {
        System.out.println("hi");
    }
}
