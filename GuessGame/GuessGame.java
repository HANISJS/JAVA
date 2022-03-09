public class GuessGame {
    private Player p1;
    private Player p2;
    private Player p3;

    public void startGame(Player a, Player b, Player c) {
        p1 = a;
        p2 = b;
        p3 = c;
        p1.pickNumber();
        p2.pickNumber();
        p3.pickNumber();

       boolean p1isright = false;
       boolean p2isright = false;
       boolean p3isright = false;

        while (true) {
            //player1이 player2와 player3에게 ask
            System.out.println(p1.getName() + " ask to guess " + p2.getName() + " and " + p3.getName());
            p2isright = p1.askToGuess(p2);
            p3isright = p1.askToGuess(p3);
            if (p2isright) System.out.println(p2.getName() + " got it right");
            if (p3isright) System.out.println(p3.getName() + " got it right");
            if (p2isright || p3isright)
                break;
            //player2이 player1와 player3에게 ask
            System.out.println(p2.getName() + " ask to guess " + p1.getName() + " and " + p3.getName());
            p1isright = p2.askToGuess(p1);
            p3isright = p2.askToGuess(p3);
            if(p1isright) System.out.println(p1.getName() + " got it right");
            if(p3isright) System.out.println(p3.getName() + " got it right");
            if (p1isright || p3isright)
                break;
            //player3이 player1와 player2에게 ask
            System.out.println(p3.getName() + " ask to guess " + p1.getName() + " and " + p2.getName());
            p1isright = p3.askToGuess(p1);
            p2isright = p3.askToGuess(p1);
            if(p1isright) System.out.println(p1.getName() + " got it right");
            if(p2isright) System.out.println(p2.getName() + " got it right");
            if (p1isright || p2isright)
                break;
        }
    }
}
