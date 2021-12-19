package ca.ematos.leetcode.arrays;

public class NumberOfIslands {

    public static void main(String[] args){

        int[][] matrix_1 =
                {
                    {1,1,1,1,0},
                    {1,1,0,1,0},
                    {1,1,0,0,0},
                    {0,0,0,0,0}
                };

        int[][] matrix_2 =
                {
                    {1,1,0,0,0},
                    {1,1,0,0,0},
                    {0,0,1,0,0},
                    {0,0,0,1,1}
                };

        int[][] matrix_3 =
                {
                    {1,1,0,0,0},
                    {0,1,0,0,1},
                    {1,0,0,1,1},
                    {0,0,0,0,0}
                };

        System.out.println(String.format("Expected [%s] Result [%s]", 1, islands(matrix_1)));
        System.out.println(String.format("Expected [%s] Result [%s]", 3, islands(matrix_2)));
        System.out.println(String.format("Expected [%s] Result [%s]", 3, islands(matrix_3)));
    }

    private static int islands(int[][] matrix) {

        if ( matrix == null || matrix.length == 0){
            return 0;
        }

        int numIslands = 0;
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){

                if (matrix[i][j] == 1){
                    numIslands += dfs(matrix, i, j);
                }
            }
        }

        return numIslands;
    }

    private static int dfs(int[][] matrix, int row, int column){

        if ( row < 0 || row == matrix.length || column < 0 || column == matrix[row].length || matrix[row][column] == 0){
            return 0;
        }

        matrix[row][column] = 0;

        dfs(matrix, row + 1, column);
        dfs(matrix, row - 1, column);
        dfs(matrix, row, column + 1);
        dfs(matrix, row, column - 1);

        return 1;
    }
}
