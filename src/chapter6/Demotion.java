package chapter6;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-11日--17:12
 */
public class Demotion {

    void f1(double x){
        System.out.println("f1(double)");
    }

    void f2(float x){
        System.out.println("f2(float)");
    }

    void f3(long x){
        System.out.println("f3(long)");
    }

    void f4(int x){
        System.out.println("f4(int)");
    }

    void f5(short x){
        System.out.println("f5(short)");
    }
    void f6(byte x){
        System.out.println("f6(byte)");
    }
    void f7(char x){
        System.out.println("f7(char)");
    }

    void testDouble(){

        double x  = 0;
        System.out.println("double argument:");
        f1(x);
        f2((float)x);
        f3((long)x);

        f4((int)x);
        f5((short)x);
        f6((byte)x);
        f7((char)x);
    }

    public static void main(String[] args) {
        Demotion d = new Demotion();
        d.testDouble();
    }
}
