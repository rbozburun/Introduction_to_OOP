package tictactoe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InvalidMoveException {
        Scanner reader = new Scanner(System.in);

        Board board = new Board();

        System.out.println(board);
        while (!board.isEnded()) {

            int player = board.getCurrentPlayer();

            System.out.print("Player " + player + " enter row number:");
            int row = 0;
            try{
                row= Integer.valueOf(reader.nextLine());
            }catch (NumberFormatException e){
                System.out.println("You have to give a number!");
            }

            ;
            //NumberFormatException



            System.out.print("Player " + player + " enter column number:");
            int col=0;

            do {
                try{
                    col= Integer.valueOf(reader.nextLine());
                    break;
                }catch (NumberFormatException e){
                    System.out.println("You have to give a number!");
                }
            }while(true);



            board.move(row, col);
            System.out.println(board);
        }


        reader.close();
    }


}
