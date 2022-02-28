class A4
{
    int rollno;
    String sname;
 }
//interface B4
//{
//     void show();
//}
////class xyz implements B4
////{ @Override
////    public void show() {
////
////    }
////}
//public class InnerLambda{
//    public static void main(String[] args) {
//        B4 obj1=new B4()// Anonymous class
//        {   public void show()
//        {
//            System.out.println("hi");
//        }
//        };
//        obj1.show();
//    }
//}
@FunctionalInterface
// FunctionalInterface having one method(Lambda expression it works with only Functional Interface)
interface B4
{
    void show();

}
//class xyz implements B4
//{ @Override
//    public void show() {
//
//    }
//}
public class InnerLambda{
    public static void main(String[] args) {
        B4 obj1=()->{
            System.out.println("hello");
        };
        obj1.show();
    }
}
