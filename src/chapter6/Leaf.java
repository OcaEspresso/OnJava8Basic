package chapter6;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-11日--17:54
 */
public class Leaf {

    int i = 0;
    Leaf increment(){
        i++;
        return this;
    }

    void print(){
        System.out.println("i=" + i);
    }

    public static void main(String[] args) {

        Leaf x = new Leaf();
        x.increment().increment().print();
    }
}
