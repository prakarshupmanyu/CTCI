/*
Q - 8: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
column are set to 0.
*/

import java.util.*;

public class q8{
	private void convertMatrix(int[][] a, int r, int c){
		System.out.println();
		int[] rows = new int[r], cols = new int[c];
		for(int i = 0;i < r;i++){
			for(int j = 0;j < c;j++){
				if(a[i][j] == 0){
					rows[i] = 1;
					cols[j] = 1;
				}
			}
		}

		for(int i = 0;i < r;i++){
			for(int j = 0;j < c;j++){
				if(rows[i] == 1 || cols[j] == 1){
					a[i][j] = 0;
				}
			}
		}
	}

	private void displayMatrix(int[][] a, int r, int c){
		for(int i = 0;i < r;i++){
			for(int j = 0;j < c;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String args[]){
		int[][] a = {{2,3,5,0},{2,0,3,4},{1,2,3,4},{7,2,4,0},{1,2,3,4}};
		int r = 5, c = 4;
		q8 obj = new q8();
		obj.displayMatrix(a,r,c);
		obj.convertMatrix(a,r,c);
		obj.displayMatrix(a,r,c);
	}
}
