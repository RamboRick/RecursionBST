package class01;
// problem 2 Recursion
public class PoweraOfb {
	public long power(int a, int b) {
		if(a == 0) {
			return 0;
		}
		if(b == 0) {
			return 1;
		}
		long halfPower = power(a, b/2);
		return b%2 == 0 ? halfPower*halfPower : halfPower*halfPower*a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PoweraOfb sol = new PoweraOfb();
		System.out.println(sol.power(2, 8));
	}

}
