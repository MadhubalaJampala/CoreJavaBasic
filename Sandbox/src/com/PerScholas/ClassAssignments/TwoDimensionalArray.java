package com.PerScholas.ClassAssignments;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int[][] arr2d = {
						{1,2,3},
						{4,5,6},
						{7,8,9}
						};
		for(int i=0;i<arr2d.length;i++) {
			for(int j=0;j<arr2d[i].length;j++) {
				System.out.println(arr2d[i][j]);
			}
		}
		for(int[] i:arr2d)
			for(int j:i)
				System.out.println(j);
	}

}
