
public class Main{
    public static void main(String[] args) {
        Player player1 = new Player("O  ");
        Player player2 = new Player("X  ");
        Board board = new Board(player1, player2);
        Game game = new Game(board);
        game.getBoard().render();
        while (game.getRunning()) {
            game.getBoard().getPlayer1().play();
            game.getBoard().upBorder(game.getBoard().getPlayer1().getInput());
            game.getBoard().render();
            game.verify(game.getBoard().getPlayer1().getMark());
            if(!game.getRunning()){
                break;
            }

            game.getBoard().getPlayer2().play();
            game.getBoard().upBorder(game.getBoard().getPlayer2().getInput());
            game.getBoard().render();
            game.verify(game.getBoard().getPlayer2().getMark());

        }

    }
}