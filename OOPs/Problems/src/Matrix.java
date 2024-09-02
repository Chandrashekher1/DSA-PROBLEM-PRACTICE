public class Matrix {
    int rows;
    int cols;
    int[][] matrix;

    public Matrix(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        matrix = new int[rows][cols];
    }

    public void randomFill(){
        for (int i=0; i<rows;i++){
            for (int j=0; j<cols; j++){
                matrix[i][j] = (int) (Math.random() *10);
            }
        }
    }

    public void display(){
        for (int i=0; i<rows;i++){
            for (int j=0; j<cols;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public Matrix multiply(Matrix other) {
        if (this.cols != other.rows) {
            throw new IllegalArgumentException("Matrix dimensions must match for multiplication.");
        }

        Matrix result = new Matrix(this.rows, other.cols);

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                int sum = 0;
                for (int k = 0; k < this.cols; k++) {
                    sum += this.matrix[i][k] * other.matrix[k][j];
                }
                result.matrix[i][j] = sum;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 3);
        matrix1.randomFill();
        System.out.println("Matrix 1:");
        matrix1.display();

        Matrix matrix2 = new Matrix(3, 2);
        matrix2.randomFill();
        System.out.println("\nMatrix 2:");
        matrix2.display();

        Matrix result = matrix1.multiply(matrix2);
        System.out.println("\nResult of multiplication:");
        result.display();
    }
}



