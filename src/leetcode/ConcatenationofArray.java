package leetcode;

import java.util.Arrays;

public class ConcatenationofArray {

	public static void main(String[] args) {
		ConcatenationofArray obj = new ConcatenationofArray();
		int[] arr = { 1, 2, 1 };
		int[] result = obj.getConcatenation(arr);
		System.out.println(Arrays.toString(result));
	}

	public int[] getConcatenation(int[] nums) {
		int n = nums.length;
		int[] newArr = new int[2 * n];
		for (int i = 0; i < n; i++) {
			newArr[i] = nums[i];
			newArr[i + n] = nums[i];
		}
		return newArr;
	}
}
