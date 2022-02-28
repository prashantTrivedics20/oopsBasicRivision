public class Oops6 {
    public static void main(String[] args) {
        // break switch loop
        prashant://(:) define it's a label
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=4 ; j++) {
                if(i==3)
                {
                    break prashant;// it will break the outerloop
                    // and this type is called labeled break statement..
                }
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
