package lesson4;

public class Additional2 {
    public static void main(String[] args) {
        int[][] mas1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] mas2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};

        int[][] result = new int[mas1.length][mas2[0].length];
        for (int i = 0; i < result[0].length; i++)
            for (int j = 0; j < result.length; j++)
                for (int k = 0; k < mas1[0].length; k++)
                    result[i][j] = result[i][j] + mas1[i][k] * mas2[k][j];


        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(" " + result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

