package PACKAGE_NAME;

import java.util.Scanner;

public class Player {
    private String mark;
    private String input;

    public Player(String mark){
        this.mark = mark;
    }

    public String play(){
        Scanner scanner = new Scanner(System.in);
        setInput(scanner.next());

        return getInput();
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

}
