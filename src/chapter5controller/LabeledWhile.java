package chapter5controller;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-01月-09日--11:42
 */
public class LabeledWhile {
    public static void main(String[] args) {

        int i = 0;
        outer:
        while(true){

            System.out.println("outer while loop");
            while(true){
                i++;
                System.out.println("i = " + i);
                if(i == 1){
                    System.out.println("continue");
                    continue;
                }
                if(i == 3){
                    System.out.println("continue outer");
                    continue outer;
                }

                if(i == 5){
                    System.out.println("break");
                    break;
                }

                if(i == 7){
                    System.out.println("break outer");
                    break outer;
                }
            }
        }




    }
}
