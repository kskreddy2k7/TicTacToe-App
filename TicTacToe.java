public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {

        while (!gameOver) {

            printBoard();

            if (isHumanTurn) {
                System.out.println("Human Turn (X)");
                // demo move (you can replace with input later)
                placeMove(0, 0, 'X');
            } else {
                System.out.println("Computer Turn (O)");
                computerMove();
            }

            // check game state
            if (checkWin('X') || checkWin('O')) {
                printBoard();
                System.out.println("Game Over - We have a winner!");
                gameOver = true;
            } else if (isBoardFull()) {
                printBoard();
                System.out.println("Game Over - It's a draw!");
                gameOver = true;
            }

            // switch turn
            isHumanTurn = !isHumanTurn;
        }
    }

    // UC6
    static void placeMove(int row, int col, char symbol) {
        if (board[row][col] == '-') {
            board[row][col] = symbol;
        }
    }

    // UC7
    static void computerMove() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    board[i][j] = 'O';
                    return;
                }
            }
        }
    }

    // check win
    static boolean checkWin(char symbol) {

        // rows & columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) ||
                (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)) {
                return true;
            }
        }

        // diagonals
        if ((board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
            (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)) {
            return true;
        }

        return false;
    }

    // check draw
    static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    // display
    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
