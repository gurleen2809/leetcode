package leetcode;

import java.util.Arrays;

public class MaxGap {
	
	public static void main(String[] args) {
		
		int[] arr = {2,5,7,9};
		MaxGap obj = new MaxGap();
		obj.maximumGap(arr);
		System.out.println(obj.maximumGap(arr));
	}
public int maximumGap(int[] nums) {
	 Arrays.sort(nums);
	 System.out.println(Arrays.toString(nums));
	int max = 0;
    for(int i=1;i<nums.length;i++) {
    	int gap = nums[i] - nums[i-1];
    	//System.out.println(gap);
    	if(gap > max)
    		max = gap;
    }    
	return max;
    }

}
