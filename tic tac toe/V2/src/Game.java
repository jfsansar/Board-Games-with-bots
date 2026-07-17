package PACKAGE_NAME;

public class Game {
    private boolean isRunning;
    private Board board;
    private Player player1;
    private Player player2;

    public Game(Board board, Player player1, Player player2){
        this.isRunning = true;
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void run(){
        getBoard().render("5a", "");
        while (isRunning()){
            validPlay(getPlayer1().getMark(), getPlayer1().play());
            getBoard().render(getPlayer1().getInput(), getPlayer1().getMark());
            verify(getPlayer1().getMark());
            if(!isRunning()){
                break;
            }
            validPlay(getPlayer2().getMark(), getPlayer2().play());
            getBoard().render(getPlayer2().getInput(), getPlayer2().getMark());
            verify(getPlayer2().getMark());
        }
    }

    public void verify(String mark) {

        var board = getBoard().getMatriz();

        for(var l=0;l<=2;l++){
            if(
              board[l][0].equals(mark) &&
              board[l][1].equals(mark) &&
              board[l][2].equals(mark)
            ){
                win(mark);
            }
        }
        for (var c=0;c<=2;c++){
            if(
               board[0][c].equals(mark) &&
               board[1][c].equals(mark) &&
               board[2][c].equals(mark)
            ){
                win(mark);
            }
        }
        if(
          board[0][0].equals(mark) &&
          board[1][1].equals(mark) &&
          board[2][2].equals(mark)
        ){
            win(mark);
        }
        if(
           board[0][2].equals(mark) &&
           board[1][1].equals(mark) &&
           board[2][0].equals(mark)
        ){
            win(mark);
        }
        var cont=0;
        for(String[] linha: board){
            for(String b:linha){
                if(!b.equals("-")){
                    cont++;
                }
            }
        }
        if(cont==9){
            setRunning(false);
            System.out.println("Velha");
        }


    }

    public void validPlay(String mark, String input){
        getBoard().ConvertInput(input);
        while(!"-".equals(getBoard().getMatriz()
                [getBoard().getRow()][getBoard().getCollumn()])){
             System.out.println("jogada invalida! Tente novamente");
             if(mark.equals(getPlayer1().getMark())){
                 getBoard().ConvertInput(getPlayer1().play());
             }else{
                    getBoard().ConvertInput(getPlayer2().play());
             }

        }

    }

    public void win(String mark){
        if(mark == getPlayer1().getMark()){
            System.out.println("Player 1 WIN");
        }else {
            System.out.println("Player 2 WIN");
        }
        setRunning(false);
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

}