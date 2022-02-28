// we have three inner class-
// 1-MemberInnerClass
// 2-static Innerclass
// 3-Anonymous inner class
//member inner clas


class A
{
    int rollno;
    String sname;
    class B
    {
        public void show()
        {
            System.out.println("hello");
        }
    }


}
public class InnerClass {
    public static void main(String[] args) {
        A obj=new A();
        A.B obj1=obj.new B();//memeber inner class object

    }
}
