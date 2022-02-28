// static inner class
class A1
{
    int rollno;
    String sname;
   static  class B1
    {
        public void show()
        {
            System.out.println("hello");
        }
    }
}
public class staticInnerClass{
    public static void main(String[] args) {
        A1 obj=new A1();
        A1.B1 obj1=new A1.B1();//static inner class object
        obj1.show();

    }
}
