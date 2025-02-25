package polymorphism;

/**
 * @description
 * @author: RicksonYu
 * @create: 2024年-12月-17日--16:28
 */

class StaticSuper{

    public static String staticGet(){
        return "Base staticGet";
    }

    public String dynamicGet(){
        return "Base dynamicGet";
    }

}

class StaticSub extends StaticSuper{

    public static String staticGet(){
        return "Derived staticGet";
    }

    @Override
    public String dynamicGet() {
        return "Derived dynamicGet()";
    }

}


public class StaticPolymorphism {

    public static void main(String[] args) {

        StaticSuper sup = new StaticSub();
        System.out.println(sup.staticGet());
        System.out.println(sup.dynamicGet());
    }


}
