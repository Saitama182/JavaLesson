public class Main {
    public static void main(String[] args) {
        String[][] strings = new String[2][3]; // 2 строки и 3 столбца
        System.out.println(strings[0][1]);

        int[][] matrix = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        for (int i = 0; i < matrix.length; i++) { // цикл проходится по строкам
            for (int j = 0; j < matrix[i].length; j++) { // цикл проходится по каждому элементу в этой строке
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}