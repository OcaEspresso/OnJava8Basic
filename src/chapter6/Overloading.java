package chapter6;

/**
 * @description 方法重载
 * @author: RicksonYu
 * @create: 2025年-01月-09日--15:28
 */
class Tree{

    int height;
    Tree(){
        System.out.println("Planting a seedling");
        height = 0;
    }

    Tree(int initialHeight){
        height = initialHeight;
        System.out.println("Creating new Tree that is " + height + " feet tall");
    }

    void info(){
        System.out.println("Tree is " + height + " feet tall");
    }

    void info(String s){
        System.out.println(s + ": Tree is " + height + " feet tall");
    }

}
public class Overloading {


    public static void main(String[] args) {


        for(int i = 0; i < 5; i++)
        {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }

        //调用重载构造器
        new Tree();


    }

}
