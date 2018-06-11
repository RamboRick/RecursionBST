package class01;
//problem05 BST03
public class BSTTarget {
	public int closeTar(int[] arr, int target) {
		if( arr == null || arr.length == 0) {
			return -1;
		}
		int l = 0;
		int r = arr.length; 
		while(l < r-1) {
			int mid = l + (r-l)/2;
			if(arr[mid] == target) {
				return mid;
			}else if(arr[mid] > target) {
				r = mid;
			}else {
				l = mid;
			}
		}
		if(Math.abs(arr[l] - target) >Math.abs(arr[r] - target)) {
			return r;
		}else {
			return l;
		}
	}
}
