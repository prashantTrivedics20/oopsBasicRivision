import java.util.Arrays;

// shallow copy and deep copy (both deep copy and shallow copy refer to creating a copy of the object given in different ways.
// Object copy
public class Oops1 {
    public static void main(String[] args) {

        /*
        1-shallow
        2-Deep
        3-Clone
         */
        // shallow
        // in case of shallow copy we are not creating the two object basically we are creating the two reference
        // means in a heap memory we are getting only one object with two reference  obj,obj1
        // and both of the reference pointing the same object if we change the obj1 it will refelect on the obj and viceversa.
        // that is the problem of shallow.
        abc obj=new abc();
        obj.i=5;
        obj.j=6;
        abc obj1=new abc();
        obj1=obj;//shallow copy
        obj1.j=7;// in case of shallow copy if we change the element then it will reflect the original copy...
        System.out.println(obj);
        System.out.println(obj1);
    }
}
class abc
{
    int i;
    int j;

    @Override
    public String toString() {
        return "abc{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }
}
