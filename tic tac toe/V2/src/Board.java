package PACKAGE_NAME;

import java.util.ArrayList;

public class Board {
    private String[][] matriz;
    private int collumn;
    private int row;

    public Board() {
        this.matriz = new String[][]{
                {"-", "-", "-"},
                {"-", "-", "-"},
                {"-", "-", "-"}
        };
    }

    public void render(String input, String mark){
        ConvertInput(input);
        System.out.println(getCollumn() + " "+ getRow());
        System.out.println(
                "   A  " + "B  " + "C  "
        );
        for(var l = 0;l<=2;l++){
            System.out.print(l + 1+ "  ");
            for (var c=0;c<=2;c++){
                if(getCollumn() == c && getRow() == l){
                    getMatriz()[l][c] = mark;
                }
                System.out.print(getMatriz()[l][c] + "  ");


            }
            System.out.println();
        }
    }

    public void ConvertInput(String input){
        setRow(Integer.parseInt(String.valueOf(input.charAt(0)))-1);
        setCollumn(input.charAt(1) - 'A');
    }

    public int getCollumn() {
        return collumn;
    }

    public void setCollumn(int collumn) {
        this.collumn = collumn;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public String[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(String[][] matriz) {
        this.matriz = matriz;
    }
}
