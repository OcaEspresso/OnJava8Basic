package polymorphism;

/**
 * @description
 * @author: RicksonYu
 * @create: 2024年-12月-17日--13:10
 */
public class Percussion extends Instrument{
    @Override
    public void play(Note n) {
        System.out.println("Percussion.play() "+n);
    }

    @Override
    String what() {
        return "Percussion";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}
