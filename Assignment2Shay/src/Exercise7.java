import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        char[] board = {'-' , '-', '-' , '-', '-' , '-', '-' , '-', '-'};
        printBoard(board);
        System.out.println();
        boolean winner = false;
        char currentPlayer = 'X';
        do {
            int position = getPositionFromUser(board, currentPlayer);
            winner = placeSymbolOnBoard(board, position, currentPlayer);

            if(currentPlayer == 'X'){
                currentPlayer = 'O';
            } else {
                currentPlayer = 'X';
            }
        }
        while (!winner);



    }
    public static void printBoard(char[] board){
        for (int i = 0; i < board.length; i++){
            if (i % 3 == 0){
                System.out.println();
            }
            System.out.print(board[i] + " ");
        }
    }
    public static boolean isAvailable(char[] board, int index){
        return board[index] != 'X' && board[index] != 'O';

    }
    public static int getPositionFromUser(char[] board, char symbol){
        Scanner scanner = new Scanner(System.in);
        int position;
        do {
            System.out.println("Enter a position");
            position = scanner.nextInt();
            if (position < 1 || position > 9){
                System.out.println("Not a position");
                continue;
            }
            if (isAvailable(board, position -1)){
                return position -1;
            }
            else {
                System.out.println("The position you choose is unavailable");
            }
        } while (true);
        }

    public static char checkWinner(char[] board){
        if(((board[0] == board[1] && board[0] == board[2]) || (board[0] == board[3] && board[0] == board[6]) || (board[0] == board[4] && board[0] == board[8])) && board[0] != '-'){
            return board[0];
        }
        else if((board[1] == board[4] && board[1] == board[7]) && board[1] != '-'){
            return board[1];
        }
        else if((board[2] == board[5] && board[2] == board[8]) || (board[2] == board[4] && board[2] == board[6])){
            return board[2];
        }
        else if(board[3] == board[4] && board[3] == board[5]){
            return board[3];
        }
        else if(board[6] == board[7] && board[6] == board[8]){
            return board[6];
        }
        return '-';


    }
    public static boolean placeSymbolOnBoard(char[] board, int position, char currentPlayer){
        board[position] = currentPlayer;
        printBoard(board);
       if (checkWinner(board) == currentPlayer){
           System.out.println("The player "  + currentPlayer + " has won" );
           return true;
       }
       return false;
    }
}
