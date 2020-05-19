package tictactoe;

public class InvalidMoveException extends Exception {
    @Override
    public String getMessage() {
        return "Invalıid move!";
    }
}
