package testproject;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        while(true){
            int targetNumber = (int) (Math.random() * 100);
            System.out.println("I'm guessing the number from 0 to 100....");
            System.out.println("The number which you should to guess, - " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("The Player1 think this is a number - " + guessp1);

            guessp2 = p2.number;
            System.out.println("The Player2 think this is a number - " + guessp2);

            guessp3 = p3.number;
            System.out.println("The Player3 think this is a number - " + guessp3);

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("\nWe have a WINNER!");
                System.out.println("The Player 1 result - " + p1isRight);
                System.out.println("The Player 2 result - " + p2isRight);
                System.out.println("The Player 3 result - " + p3isRight);
                break;
            } else {
                System.out.println("The players should start the new game!!!");
            }
        }
    }


}
