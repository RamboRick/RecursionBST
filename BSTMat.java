package class01;
//problem4 BST02
public class BSTMat{
	public boolean isFind(int[][] mat, int target) {
		if(mat.length == 0 ||mat[0].length == 0) {
			return false;
		}
		int row = mat.length;
		int col = mat[0].length;
		int l = 0;
		int r = row * col -1;
		while(l<=r) {
			int mid = l + (r-l)/2;
			int rowMid = mid/col;
			int colMid = mid%col;
			if(mat[rowMid][colMid] == target) {
				return true;
			}else if(mat[rowMid][colMid] > target) {
				r = mid -1;
			}else {
				l = mid +1;
			}
		}
		return false;
	}
}