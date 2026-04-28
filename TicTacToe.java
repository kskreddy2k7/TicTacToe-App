public class TicTacToe {

    static char[][] board = {
        {'X', 'O', 'X'},
        {'O', 'X', 'O'},
        {'O', 'X', 'O'}
    };

    public static void main(String[] args) {
        System.out.println(isDraw());
    }

    // UC10: Check draw condition
    static boolean isDraw() {

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {

                // If any empty cell exists → not draw
                if (board[r][c] == '-') {
                    return false;
                }
            }
        }

        // No empty cells → draw
        return true;
    }
}public class TicTacToe {

    static char[][] board = {
        {'X', 'O', 'X'},
        {'O', 'X', 'O'},
        {'O', 'X', 'O'}
    };

    public static void main(String[] args) {
        System.out.println(isDraw());
    }

    // UC10: Check draw condition
    static boolean isDraw() {

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {

                // If any empty cell exists → not draw
                if (board[r][c] == '-') {
                    return false;
                }
            }
        }

        // No empty cells → draw
        return true;
    }
}
