package class01;
//problem06 BST04
public class BSTFirstOccurance {
	public int BST(int[] arr, int target) {
		if(arr == null || arr.length== 0) {
			return -1; 
		}
		int l = 0;
		int r = arr.length -1;
		while( l < r-1) {
			int mid = l + (r-l) /2;
			if(arr[mid] == target) {
				r = mid;
			}else if(arr[mid] > target) {
				r = mid; // r = mid -1 is also OK!!!
			}else {
				l = mid;
			}
		}
		if(arr[l] == target) {
			return l;
		}
		if(arr[r] == target) {
			return r;
		}
		return -1;
	}
}
