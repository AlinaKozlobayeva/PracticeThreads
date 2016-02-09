package ua.org.oa.kozlobaeva.Practice5.part4;

public class Part4 {
	
	public static void main(String[] args) {

		long startTime1 = System.currentTimeMillis();
		int rows = 10;
		int colums = 1000;
		double max;

		System.out.println("Create your own matrix");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		RandomMatrix matrix = new RandomMatrix(rows,colums);
		matrix.createMatrix();
//		System.out.println(matrix.toString());

		for (int i = 0; i < matrix.getRows(); i++) {
			new Finder().run(matrix.getRow(i));

		}
		long endTime1 = System.currentTimeMillis();
		long totalTime1 = endTime1 - startTime1;
		System.out.println("Time of first variant of programm: " + totalTime1);

//		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//
//		long startTime2 = System.currentTimeMillis();
//		max = matrix.getElement(0,0);
//		for (int i = 0; i < matrix.getRows(); i++) {
//			for (int j = 0; j < matrix.getColums(); j++) {
//			 	if(matrix.getElement(i,j)>max){
//					max = matrix.getElement(i,j);
//				}
//			}
//		}
//		System.out.println(max);
//		long endTime2 = System.currentTimeMillis();
//		long totalTime2 = endTime2 - startTime2;
//		System.out.println("Time of second variant of programm: " + totalTime2);

		
	}

}