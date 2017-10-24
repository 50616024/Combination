package combination;

public class Combination_lib {

	public int getFactorial(int n) {  //nŠKæ
		int f = 1;
		//ŠKæŒvZ
		while(n > 0) {
			f = f * n;
			n--;
		}
		return f;
	}

}
