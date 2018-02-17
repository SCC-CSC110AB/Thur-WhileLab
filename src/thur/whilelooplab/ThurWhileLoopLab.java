package thur.whilelooplab;

import java.util.Scanner;

/**
 *
 * @author john
 */
public class ThurWhileLoopLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean isUserFinished = true;
        char userInput;
        
        for (int i = 0; i < 3 && !isUserFinished; i++) {
            System.out.println("What's your favorite animal?");
            System.out.println("A\tDog");
            System.out.println("B\tCat");
            System.out.println("C\tCow");
            System.out.println("Q\tQuit");
            
            userInput = keyboard.nextLine().toLowerCase().charAt(0);
            
            switch (userInput) {
                case 'a':
                    System.out.println("Woof woof");
                    break;
                case 'b':
                    System.out.println("Meow purr");
                    break;
                case 'c':
                    System.out.println("Mooooooo");
                    break;
                case 'q':
                    isUserFinished = true;
                    break;
                default:
                    System.out.println("Can't you read the menu??");
            }
        }
    }
    
}
