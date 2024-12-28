package leetcode;

import java.util.Arrays;

public class DiagonalMatrixSum {
	public static void main(String[] args) {
			DiagonalMatrixSum o = new DiagonalMatrixSum();
			int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
			int res = o.diagonalSum(arr);
			//System.out.println(res);
	}

	public int diagonalSum(int[][] mat) {
		 int n = mat.length;
	        int ans =0;
	        for(int i=0;i<n;i++){
	            ans += mat[i][i];
	            ans += mat[n-1-i][i];
	            System.out.println(mat[n-1-i][i]);
	        }
	        if(n%2 != 0){
	            ans -= mat[n/2][n/2];
	        }
	        return ans;
		}
	}

