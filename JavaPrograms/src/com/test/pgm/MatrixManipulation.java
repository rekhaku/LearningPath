package com.test.pgm;

import java.io.IOException;

import com.test.pgm.utils.ProgramUtils;

public class MatrixManipulation {

	public static void main(String args[]) {
		Matrix matrix1 = new Matrix();
		matrix1.createMatrix();
		Matrix matrix2 = new Matrix();
		matrix2.createMatrix();
		matrix1.printMatrix();
		matrix2.printMatrix();
	}
	
	private void addMatrix(Matrix m1,Matrix m2)
	{
		
	}
}

class Matrix {
	int noOfRows;
	int noOfColumns;
	int matrix[][];

	public int getNoOfRows() {
		return noOfRows;
	}

	public void setNoOfRows(int noOfRows) {
		this.noOfRows = noOfRows;
	}

	public int getNoOfColumns() {
		return noOfColumns;
	}

	public void setNoOfColumns(int noOfColumns) {
		this.noOfColumns = noOfColumns;
	}
	

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int[][] matrix) {
		this.matrix = new int[this.noOfRows][noOfColumns];
		
	}

	public void printMatrix() {
		System.out.println("________________________________________");		
		for (int i = 0;i< this.noOfRows;i++)
		{
			System.out.print("|");
			for(int j =0;j<this.noOfColumns ; j++)
			{
				System.out.print(this.matrix[i][j] +" ");
			}
			System.out.print("|");
			System.out.println();
		}
		
		System.out.println("________________________________________");	
	}
	
	public void readMatrix() {
		this.matrix = new int[this.noOfRows][noOfColumns];
		for (int i = 0;i< this.noOfRows;i++)
		{
			for(int j =0;j<this.noOfColumns ; j++)
			{
				try {
					this.matrix[i][j]= ProgramUtils.readInputInt();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	public void createMatrix() {
		try {
			System.out.println("enter no .of rows");
			this.noOfRows = ProgramUtils.readInputInt();
			System.out.println("enter no.of columns");
			this.noOfColumns = ProgramUtils.readInputInt();			
			System.out.println("enter rows");
			readMatrix() ;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
