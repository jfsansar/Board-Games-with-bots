import PACKAGE_NAME.Board;
import PACKAGE_NAME.Game;
import PACKAGE_NAME.Player;

public static void main(String[] args) {
    Board board = new Board();
    Player player1 = new Player("X");
    Player player2 = new Player("O");
    Game game = new Game(board, player1, player2);

    game.run();



}

