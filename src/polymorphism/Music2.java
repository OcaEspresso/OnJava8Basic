package polymorphism;

/**
 * @description
 * @author: RicksonYu
 * @create: 2024年-12月-17日--11:06
 */

class Stringed extends Instrument{

    @Override
    public void play(Note n) {
        System.out.println("Stringed.play() "+ n);
    }

    @Override
    String what() {
        return "Stringed";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}

class Brass extends Instrument{
    @Override
    public void play(Note n) {
        System.out.println("Brass.play() "+ n);
    }

    @Override
    String what() {
        return "Brass";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Brass");
    }
}

public class Music2 {

    public static void tune(Wind i){
        i.play(Note.MIDDLE_C);
    }
    public static void tune(Stringed i){
        i.play(Note.MIDDLE_C);
    }

    public static void tune(Brass i){
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flte = new Wind();
        Stringed violn = new Stringed();
        Brass frenchHorn = new Brass();

        tune(flte);
        tune(violn);
        tune(frenchHorn);
    }
}
