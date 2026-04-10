package core_programming.java_methods.Level3;

public class matrix_operations_advanced {

    public static int[][] createMatrix(int r, int c) {
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = (int)(Math.random() * 10);
        return m;
    }

    public static int[][] add(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                res[i][j] = a[i][j] + b[i][j];

        return res;
    }

    public static int[][] subtract(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                res[i][j] = a[i][j] - b[i][j];

        return res;
    }

    public static int[][] multiply(int[][] a, int[][] b) {
        int[][] res = new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b[0].length; j++)
                for (int k = 0; k < b.length; k++)
                    res[i][j] += a[i][k] * b[k][j];

        return res;
    }

    public static int[][] transpose(int[][] m) {
        int[][] t = new int[m[0].length][m.length];

        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                t[j][i] = m[i][j];

        return t;
    }

    public static int det2x2(int[][] m) {
        return m[0][0]*m[1][1] - m[0][1]*m[1][0];
    }

    public static int det3x3(int[][] m) {
        return m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1])
                - m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0])
                + m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    public static void display(int[][] m) {
        for (int[] row : m) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[][] a = createMatrix(2,2);
        int[][] b = createMatrix(2,2);

        display(a);
        display(b);

        display(add(a,b));
        display(subtract(a,b));
        display(multiply(a,b));
        display(transpose(a));

        System.out.println("Determinant: " + det2x2(a));
    }
}