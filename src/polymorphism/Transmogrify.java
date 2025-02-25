package polymorphism;

/**
 * @description 通过组合动态的改变对象的行为
 * @author: RicksonYu
 * @create: 2024年-12月-20日--16:51
 */
class Actor{
    public void act(){}
}

class HappyActor extends Actor{


    @Override public void act(){
        System.out.println("HappyActor!");
    }

}

class SadActor extends Actor{

    @Override
    public void act(){
        System.out.println("SadActor!");
    }
}

class Stage{

    private Actor actor = new HappyActor();
    public void change(){
        actor = new SadActor();
    }

    public void performPlay(){
        actor.act();
    }

}


public class Transmogrify {


    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
    }


}
