package chapter6;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-18日--19:12
 */

class A{

}

public class VarArgs {

    static void printArray(Object[] args){
        for (Object obj : args)
            System.out.print(obj + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Object[]{47,(float)3.14,11.11});
        printArray(new Object[]{"one","two","three"});
        printArray(new Object[]{new A(),new A(),new A()});
    }

}
