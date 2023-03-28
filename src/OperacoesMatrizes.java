public class OperacoesMatrizes {
    final static int i = 4;
    final static int j = 4;
    public static void main (String[] args) throws Exception {
        compute();
    }

    public static void compute() {
        int sum = 0;
        int k= 0;
        final int n = 4;
        int[][] matrix = new int[i][j];
        for( int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if ( i == 0 && j > 0) {
                    k++;
                    sum += matrix[j][i];
                }
                if ( i == 1 && j > 1) {
                    k++;
                    sum += matrix[j][i];
                }
                if ( i == 2 && j > 2) {
                    k++;
                    sum += matrix[j][i];
                }
            }
        }
        float average = (float) sum / k;
        System.out.println("A média é: " + average);
    }
}
