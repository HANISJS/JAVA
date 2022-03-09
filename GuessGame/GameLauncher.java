public class GameLauncher {

    public static void main(String[] args) {
        guessgame game = new guessgame();

        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        p1.playername("A");
        p2.playername("B");
        p3.playername("C");

        System.out.println("Game players are " + p1.getName() + " , " + p2.getName() + " and " + p3.getName());

        game.startGame(p1, p2, p3);

    }
}
