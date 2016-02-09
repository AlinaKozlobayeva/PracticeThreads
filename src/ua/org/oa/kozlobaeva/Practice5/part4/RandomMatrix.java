package ua.org.oa.kozlobaeva.Practice5.part4;

import java.util.Random;

/**
 * Created by Alina on 11.06.2015.
 */
public class RandomMatrix {
    private int rows;
    private int colums;
    private double[][] matrix;


    public RandomMatrix(int rows, int colums) {
        matrix = new double[rows][colums];
        this.rows = rows;
        this.colums = colums;
    }

    public double[][] createMatrix(){
        Random r = new Random( );
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
              matrix[i][j] = r.nextInt(1000);
            }
        }
        return matrix;
    }

    public double getElement(int i, int j){
     return matrix[i][j];
    }

    public double[] getRow(int row){
        return matrix[row];
    }






    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColums() {
        return colums;
    }

    public void setColums(int colums) {
        this.colums = colums;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                sb.append(String.format("%9.5f ", getElement(i, j)));
            }
            sb.append('\n');
        }
        return sb.toString();
    }

}
