public class Board {
    private Player player1;
    private Player player2;
    private String[] ArrayBoard;


    public Board(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.ArrayBoard = new String[]{
                "   ", "A  ", "B  ", "C  \n",
                "1  ", "-  ", "-  ", "-  ",
                "\n2  ", "-  ", "-  ", "-  ",
                "\n3  ", "-  ", "-  ", "-  "
        };
    }

    public void render(){
        for(String b:ArrayBoard){
            System.out.print(b);
        }
        System.out.println("\n");
    }
    public void upBorder(String cord){
        var mark = "";
        if(player1.getTurn()){
            mark = player1.getMark();
            player2.setTurn(true);
            player1.setTurn(false);
        }else {
            mark = player2.getMark();
            player1.setTurn(true);
            player2.setTurn(false);
        }


        switch (cord){
            case "1A":
                setArrayBoard(5, mark);
                break;
            case "1B":
                setArrayBoard(6, mark);
                break;
            case "1C":
                setArrayBoard(7, mark);
                break;
            case "2A":
                setArrayBoard(9, mark);
                break;
            case "2B":
                setArrayBoard(10, mark);
                break;
            case "2C":
                setArrayBoard(11, mark);
                break;
            case "3A":
                setArrayBoard(13, mark);
                break;
            case "3B":
                setArrayBoard(14, mark);
                break;
            case "3C":
                setArrayBoard(15, mark);
                break;
            default:
                System.out.println("Entrada inválida");
        }

    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public String[] getArrayBoard() {
        return ArrayBoard;
    }

    public void setArrayBoard(int indice, String mark) {
        if(getArrayBoard()[indice] == "-  "){
            getArrayBoard()[indice] = mark;
        }else{
            System.out.println("Jogada inválida");
            if(getPlayer1().getMark().equals(mark)){
                getPlayer1().setTurn(true);
                getPlayer2().setTurn(false);
                getPlayer1().play();
                upBorder(getPlayer1().getInput());
            }else{
                getPlayer2().setTurn(true);
                getPlayer1().setTurn(false);
                getPlayer2().play();
                upBorder(getPlayer2().getInput());
            }

        }
    }
}
