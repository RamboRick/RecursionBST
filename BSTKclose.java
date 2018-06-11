package class01;
//problem 07 BST05
import java.util.*;
public class BSTKclose {
	public List<Integer> findK(int[] a, int k, int target) {
		if(a == null || a.length == 0) {
			return null;
		}
		if(k > a.length) {
			return null;
		}
		List<Integer> res = new ArrayList<>();
		int l = 0;
		int r = a.length -1;
		while(l<r-1) {
			int mid = l + (r-l)/2;
			if(a[mid] == target ) {
				res.add(mid);
			}else if(a[mid] > target) {
				r = mid; 
			}else {
				l = mid;
			}
		}
		while(l >= 0 && r <= a.length-1 && k>0) {
			if(Math.abs(a[l] - target) <= Math.abs(a[r] - target)) {
				res.add(l);
				l--;
			}else{
				res.add(r);
				r++;			
			}
			k--;
		}
		while(k>0) {
			if(r<=a.length-1) { 
				res.add(r);
				r++;
			}
			if( l>=0) {
				res.add(r);
				l--;
			}
			k--;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {1,2,3,7,8,9};
		BSTKclose sol = new BSTKclose();
		List<Integer> result = sol.findK(test, 4, 4);
		System.out.println(Arrays.toString(result.toArray()));
	}
}
