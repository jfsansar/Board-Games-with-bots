public class Game {
    private Board board;
    private Boolean running;


    public Game(Board board){
        this.board = board;
        this.running = true;

    }

    public void verify(String markPlayer){
        var arrayBoard = getBoard().getArrayBoard();

        if(
            arrayBoard[5].equals(markPlayer) &&
            arrayBoard[6].equals(markPlayer) &&
            arrayBoard[7].equals(markPlayer)
        ){

            win(markPlayer);
        }else if(
            arrayBoard[9].equals(markPlayer) &&
            arrayBoard[10].equals(markPlayer) &&
            arrayBoard[11].equals(markPlayer)
        ){
            win(markPlayer);
        } else if (
                arrayBoard[13].equals(markPlayer) &&
                arrayBoard[14].equals(markPlayer) &&
                arrayBoard[15].equals(markPlayer)
        ) {
            win(markPlayer);
        } else if (
                arrayBoard[5].equals(markPlayer) &&
                arrayBoard[9].equals(markPlayer) &&
                arrayBoard[13].equals(markPlayer)
        ) {
            win(markPlayer);
        } else if (
                arrayBoard[6].equals(markPlayer) &&
                arrayBoard[10].equals(markPlayer) &&
                arrayBoard[14].equals(markPlayer)
        ) {
            win(markPlayer);
        }else if (
                arrayBoard[7].equals(markPlayer) &&
                arrayBoard[11].equals(markPlayer) &&
                arrayBoard[15].equals(markPlayer)
        ) {
            win(markPlayer);
        }else if (
                arrayBoard[5].equals(markPlayer) &&
                arrayBoard[10].equals(markPlayer) &&
                arrayBoard[15].equals(markPlayer)
        ) {
            win(markPlayer);
        }else if (
                arrayBoard[7].equals(markPlayer) &&
                arrayBoard[10].equals(markPlayer) &&
                arrayBoard[13].equals(markPlayer)
        ) {
            win(markPlayer);
        } else{
            var cont=0;
            for(String b: arrayBoard){
                if(!b.equals("-  ")){
                    cont++;
                    if(cont==arrayBoard.length){
                        System.out.println("Velha");
                        setRunning(false);
                    }

                }
            }
        }


    }
    public void win(String markPlayer){
        System.out.println(markPlayer + "win");
        setRunning(false);
    }

    public Board getBoard() {
        return board;
    }

    public Boolean getRunning() {
        return running;
    }

    public void setRunning(Boolean running) {
        this.running = running;
    }
}
