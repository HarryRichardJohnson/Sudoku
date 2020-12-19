
public class Sudoku {
    public static void main(String[] args) {

        int[][] sudokuBoard = new int[9][9];
        //Declare a 9 x 9 array to store our sudoku board

        for (int i = 0; i < 9; i++) {
            //Loops 9 times, there are nine rows in a board
            for (int j = 0; j < 9; j++) {
            //Loops 9 times, there are 9 columns in a board
                int randomNum = 1 + (int) (9 * Math.random());
                //Generates a random number for 1 to 9
                System.out.print("i =" + i + " ");
                //Prints value of i
                System.out.print("j =" + j + " ");
                //Prints value of j
                System.out.println("Random number = " + randomNum);
                //Prints the random number generated above

            }
        }
    }
}
