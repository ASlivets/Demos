package codegym;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by oslyvets
 * slivets.aleksay@gmail.com
 * on 16.04.2016.
 */
public class MatrixSnakeTraversalTest {
    @Test
    public void matrixTest() {
        MatrixSnakeTraversal traversal = new MatrixSnakeTraversal();
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] expected = new int[]{1, 4, 7, 8, 5, 2, 3, 6, 9};
        int[] actual = traversal.print(matrix);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void matrixTest2() {
        MatrixSnakeTraversal traversal = new MatrixSnakeTraversal();
        int[][] matrix = new int[][]{
                {1, 2, 3,},
                {4, 5, 6,},
                {7, 8, 9,},
                {10, 11, 12,}};
        int[] expected = new int[]{1, 4, 7, 10, 11, 8, 5, 2, 3, 6, 9, 12,};
        int[] actual = traversal.print(matrix);
        assertArrayEquals(expected, actual);
    }
}