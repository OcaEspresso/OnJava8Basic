package chapter5controller;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-09日--10:21
 */
public class TestWithReturn {

    static int test(int testval,int target)
    {
        if(testval > target)
            return +1;
        if (testval < target)
            return -1;
        return 0;//相等

    }

    public static void main(String[] args) {
        System.out.println(test(10, 5));
        System.out.println(test(5, 10));
        System.out.println(test(5, 5));
    }

}
