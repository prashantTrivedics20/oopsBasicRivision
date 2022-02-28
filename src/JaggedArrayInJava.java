import java.util.Arrays;
import java.util.Scanner;

public class JaggedArrayInJava {
    public static void main(String[] args) {
        int arr[][]=new int[3][];
        // if we are not certain the size of the coloum for each rows so by using this way you can do
        // this type of representation is called jugged representation..
        arr[0]=new int[4];
        arr[1]=new int[2];
        arr[2]=new int[3];
        Scanner readme=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=readme.nextInt();
            }
        }
        for(int a[]:arr)
        {
            System.out.println(Arrays.toString(a));
        }
    }
}
