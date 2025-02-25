package polymorphism;

/**
 * @description
 * @author: RicksonYu
 * @create: 2024年-12月-17日--14:55
 */

class Super{

    public int field = 0;
    public int getField() {return field;}
}


class Sub extends Super{

    public int field = 1;

    @Override
    public int getField() {
        return field;
    }
    public int getSuperField() {return super.field;}
}


public class FieldAccess {

    public static void main(String[] args) {
            Super sup = new Sub();


        System.out.println(

                "sub.field = " + sup.field +
                        ", sup.getField = " + sup.getField());


        Sub sub = new Sub();

        System.out.println(
                "sub.field = " +
                 sub.field + " , sub.getField() ="+
                 sub.getField() +
                 ",sub.getSuperField() = "+
                 sub.getSuperField()
        );
    }
}

