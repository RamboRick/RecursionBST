package class01;
//problem3 BST 01
public class BSTClassic01 {
	public int BSTC(int[] array, int target) {
		if(array == null || array.length == 0) {
			return -1;
		}
		int l = 0;
		int r= array.length-1;
		while(l <= r) {
			int mid = l + (r-l)/2;
			if(array[mid] == target) {
				return mid;
			}else if(array[mid] > target) {
				r = mid -1;//不能用r = mid，因为while循环出不来 会产生死循环
			}else {
				l = mid + 1;//不能用l = mid，因为while循环出不来 会产生死循环
			}
		}
		return -1;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {9,6,8,3,2,1};
		BSTClassic01 sol = new BSTClassic01();
		System.out.println(sol.BSTC(test, 8));
		
	}

}
