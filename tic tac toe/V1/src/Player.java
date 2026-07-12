import java.util.Scanner;

public class Player {
    private String mark;
    private String input;
    private Boolean turn;


    Scanner cord = new Scanner(System.in);
    public Player(String mark) {
        this.mark = mark;
        this.turn = true;

    }

    public void play(){
        System.out.println("Jogador " + getMark());
        setInput(cord.next());

    }

    public void setTurn(Boolean turn) {
        this.turn = turn;
    }

    public Boolean getTurn() {
        return turn;
    }

    public String getMark() {
        return mark;
    }

    public String getInput() {
        return input;
    }


    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setInput(String input) {
        this.input = input;
    }

}
