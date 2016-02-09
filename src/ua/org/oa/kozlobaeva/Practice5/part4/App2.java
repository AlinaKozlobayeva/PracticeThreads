package ua.org.oa.kozlobaeva.Practice5.part4;

/**
 * Created by Alina on 16.06.2015.
 */
public class App2 {
    public static void main(String [] args){


        int rows = 10;
        int colums = 1000;
        double max;

        System.out.println("Create your own matrix");
        RandomMatrix matrix = new RandomMatrix(rows,colums);
        matrix.createMatrix();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        long startTime2 = System.currentTimeMillis();
        max = matrix.getElement(0,0);
        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getColums(); j++) {
                if(matrix.getElement(i,j)>max){
                    max = matrix.getElement(i,j);
                }
            }
        }
        System.out.println(max);
        long endTime2 = System.currentTimeMillis();
        long totalTime2 = endTime2 - startTime2;
        System.out.println("Time of second variant of programm: " + totalTime2);
    }
}
