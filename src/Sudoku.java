
public class Sudoku {
    public static void main(String[] args) {

        int[][] sudokuBoard = new int[9][9];
        //declare a 9 x 9 array to store our sudoku board

        for (int i = 0; i < 9; i++) {
            int randomNum = 1 + (int) (9 * Math.random());
            System.out.println(randomNum);
        }
    }
}
