package chapter8;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-25日--23:11
 */

class Villain{

    private String name;
    protected void set(String nm) { name = nm;}
    Villain(String name) { this.name = name;}
    @Override public String toString(){

        return "I'm Villian and my name is " + name;
    }
}


public class Orc extends Villain{

    private int orcNumber;
    public Orc(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }

    public void change(String name,int orcNumber)
    {
        set(name);
        this.orcNumber = orcNumber;
    }
    @Override public String toString(){
        return "Orc " + orcNumber + ": " + super.toString();
    }

    public static void main(String[] args) {
        Orc orc = new Orc("Limburger",12);
        System.out.println(orc);
        orc.change("Bob",19);
        System.out.println(orc);
    }

}
