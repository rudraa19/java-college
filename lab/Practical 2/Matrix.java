// Written by AI

import java.util.Scanner;

public class Matrix {
    private int row, column;
    private float[][] mat;

    public Matrix(float[][] a) {
        this.row = a.length;
        this.column = a[0].length;
        this.mat = a;
    }

    public Matrix() {
        this.row = 0;
        this.column = 0;
        this.mat = new float[0][0];
    }

    public Matrix(int row, int column) {
        this.row = row;
        this.column = column;
        this.mat = new float[row][column];
    }

    public void readMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add this matrix (" + row + "x" + column + "):");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                mat[i][j] = sc.nextFloat();
            }
        }
    }

    public float[][] transpose() {
        float[][] transposed = new float[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transposed[j][i] = mat[i][j];
            }
        }
        return transposed;
    }

    public float[][] matrixMultiplication(Matrix second) {
        float[][] result = new float[this.row][second.column];
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < second.column; j++) {
                for (int k = 0; k < this.column; k++) {
                    result[i][j] += this.mat[i][k] * second.mat[k][j];
                }
            }
        }
        return result;
    }

    public void displayMatrix(float[][] a) {
        for (float[] row : a) {
            for (float val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public void displayMatrix() {
        displayMatrix(this.mat);
    }

    public float maximum_of_array() {
        float max = mat[0][0];
        for (float[] row : mat) {
            for (float val : row) {
                if (val > max) {
                    max = val;
                }
            }
        }
        return max;
    }

    public float average_of_array() {
        float sum = 0;
        int count = 0;
        for (float[] row : mat) {
            for (float val : row) {
                sum += val;
                count++;
            }
        }
        return sum / count;
    }

    public static void main(String[] args) {
        Matrix m1 = new Matrix(2, 2);
        m1.readMatrix();
        m1.displayMatrix();

        System.out.println("Transpose:");
        float[][] transposed = m1.transpose();
        m1.displayMatrix(transposed);

        System.out.println("Maximum: " + m1.maximum_of_array());
        System.out.println("Average: " + m1.average_of_array());
    }
}
