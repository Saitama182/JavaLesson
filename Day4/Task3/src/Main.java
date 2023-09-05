import java.util.Random;

/**
 * Заполнить многомерный массив (матрицу) случайными числами от 0 до 50.
 * размер матрицы задать m = 12 , n = 8 ( 12 -строки , 8 колонки).
 * В консоль вывести индекс строки, сумма чисел в которой максимальна.
 * Если таких строк несколько вывести последнюю.
 */
public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[12][8];
        Random random = new Random();

        for(int i = 0; i< matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = random.nextInt(50);
            }
        }



        int maxSum = 0;
        int maxSumInd = 0;
        for(int i = 0; i< matrix.length; i++){
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++){
                sum = sum + matrix[i][j];

            }
            if (sum >= maxSum) {
                maxSum = sum;
                maxSumInd = i;
            }

        }
        System.out.println(maxSumInd);
    }
}