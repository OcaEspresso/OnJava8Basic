package Chapter4;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-03日--17:51
 */
public class Precedence {
    public static void main(String[] args) {

        int x = 1, y =2 ,z = 3;
        int a = x + y - 2/2  + z;
        int b = x + (y - 2)/(2 + z);

        System.out.println("a = "  + a);
        System.out.println("b = "  + b);

    }

}
