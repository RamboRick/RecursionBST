package class01;
//problem 1 Recursion 
public class RecursionFib {
	public int fib(int n) {
		if(n == 0) {
			return 0;
		}else if(n == 1) {
			return 1;
		}
		return fib(n-1) + fib(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursionFib sol = new RecursionFib();
		System.out.print(sol.fib(5));
	}

}
