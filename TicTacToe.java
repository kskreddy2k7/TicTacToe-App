public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    // UC5: Validate move
    public static boolean isValidMove(int row, int col) {

        // Check bounds
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }

    // UC6: Place move on board
    public static void placeMove(int row, int col, char symbol) {

        if (isValidMove(row, col)) {
            board[row][col] = symbol;   // update board
            System.out.println("Move placed");
        } else {
            System.out.println("Invalid move");
        }
    }

    public static void main(String[] args) {

        int row = 1;
        int col = 1;
        char player = 'X';

        placeMove(row, col, player);

        // Display board after move
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
