package codegym;

/**
 * Created by oslyvets
 * slivets.aleksay@gmail.com
 * on 16.04.2016.
 */

class MatrixSnakeTraversal {
    int[] print(int[][] input) {
        int[] snake = new int[input[0].length * input.length];
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                int evenRow = i + j * input.length;
                int oddRow = 2 * input.length - i - j;
                if (j % 2 != 0) {
                    snake[oddRow] = input[i][j];
                } else {
                    snake[evenRow] = input[i][j];
                }
            }
        }
        return snake;
    }
}
