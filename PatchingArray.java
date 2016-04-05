package leetcode;

public class PatchingArray {
    //http://www.cnblogs.com/grandyang/p/5165821.html
    public int minPatches(int[] nums, int n) {
        	long miss = 1; 
	        int res = 0;
	        int i = 0;
	        
	        while(miss <= n){
	        	if(i < nums.length && nums[i] <= miss){
	        		miss = nums[i++] + miss;
	        		
	        	}else{
	        		miss = miss + miss;
	        		++res;
	        	}
	        }
	        return res;
    }
}


