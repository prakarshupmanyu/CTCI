/*
Given an image represented by an NxN matrix, where each pixel in the image is 4
bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
*/

import java.util.*;

public class q7{
	//Function to rotate square matrix clock-wise. Int array would be passed by reference so, no need to return the rotated matrix back
	private void rotateMatrix(int[][] m, int size){
		int temp;
		for(int i=0;i<size/2;i++){
			int limit = size - i;
			for(int j = i;j < limit - 1;j++){
				temp = m[i][j];
				m[i][j] = m[size-1-j][i];	//left to top
				m[size-1-j][i] = m[limit - 1][size-1-j];	//bottom to left
				m[limit - 1][size-1-j] = m[j][limit - 1];	//right to bottom
				m[j][limit - 1] = temp;	//top to right
			}
		}
	}

	//Function to print square matrix
	private void displayMatrix(int[][] m, int size){
		for(int i = 0;i < size;i++){
			for(int j = 0;j < size;j++){
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String args[]){
		int[][] m = {{1,2,3,4,2},{4,5,6,3,1},{0,7,8,9,3},{9,2,4,7,5},{3,4,5,6,2}};
		int n = 5;
		q7 obj = new q7();
		obj.displayMatrix(m, n);
		obj.rotateMatrix(m, n);	//int arrays are passed by reference
		System.out.println();
		obj.displayMatrix(m, n);
	}
}
