package chapter8;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-24日--16:38
 */

class Game{
    Game(int i){
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game{
    BoardGame(int i){
        super(i);
        System.out.println("BoardGame constructor");
    }
}

public class Chess extends BoardGame{

    Chess() {
        super(11);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
