package HomeWork_4;
import java.util.Scanner;

class TicTacToe {
    private char[][] board = new char[3][3];
    private char currentPlayer = 'X';

    public TicTacToe() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = '-';
    }

    public void printBoard() {
        for (char[] row : board) {
            for (char cell : row)
                System.out.print(cell + " ");
            System.out.println();
        }
    }

    public boolean checkWin() {
        // Проверка строк, столбцов и диагоналей
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
                    (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
                return true;
            }
        }
        return (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
                (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer);
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printBoard();
            System.out.println("Игрок " + currentPlayer + ", введите строку и столбец (0, 1 или 2):");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
                board[row][col] = currentPlayer;

                if (checkWin()) {
                    printBoard();
                    System.out.println("Игрок " + currentPlayer + " выиграл!");
                    break;
                }

                if (isBoardFull()) {
                    printBoard();
                    System.out.println("Ничья!");
                    break;
                }

                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // Смена игрока
            } else {
                System.out.println("Некорректный ход, попробуйте снова.");
            }
        }
        scanner.close();
    }

    private boolean isBoardFull() {
        for (char[] row : board)
            for (char cell : row)
                if (cell == '-') return false;
        return true;
    }

    public static void main(String[] args) {
        new TicTacToe().play();
    }
}
