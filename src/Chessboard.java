/*
Task 4:
Write a "chessboard" program that performs the following tasks:
* The program should simulate a chessboard with basic setup (i.e. before the first move) and output it on the console
* The chessboard should be saved as a 8x8 char array.
* Every square on the chessboard where there is no piece shows a 0
* Every square on the chessboard where there is a piece shows the first letter of the respective piece (without color):
* K=King, D=Queen, L=Bishop,
* 5=5ringer, T=Rook and B=Pawn
* Use suitable control structures and ensure efficient programming!
 */
public class Chessboard {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        int x;
        int y;

        for (x = 0; x < 8; x++) {
            for (y = 0; y < 8; y++) {
                chessBoard[x][y] = "0  ";
            }
        }

        for (x = 1; x < 2; x++) {
            for (y = 0; y < 8; y++) {
                chessBoard[1][y] = "B  ";
                chessBoard[6][y] = "B  ";
            }
        }

        chessBoard[0][0] = "T  ";
        chessBoard[0][1] = "S  ";
        chessBoard[0][2] = "L  ";
        chessBoard[0][3] = "D  ";
        chessBoard[0][4] = "K  ";
        chessBoard[0][5] = "L  ";
        chessBoard[0][6] = "S  ";
        chessBoard[0][7] = "T  ";

        chessBoard[7][0] = "T  ";
        chessBoard[7][1] = "S  ";
        chessBoard[7][2] = "L  ";
        chessBoard[7][3] = "D  ";
        chessBoard[7][4] = "K  ";
        chessBoard[7][5] = "L  ";
        chessBoard[7][6] = "S  ";
        chessBoard[7][7] = "T  ";

        System.out.println("Let's play chess together. :D");
        for (x = 0; x < 8; x++) {
            for (y = 0; y < 8; y++) {
                System.out.print(chessBoard[x][y]);
            }
            System.out.println();
        }
    }
}