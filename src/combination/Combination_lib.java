package combination;

public class Combination_lib {

	public int getFactorial(int n) {  //n�K��
		int f = 1;
		//�K��v�Z
		while(n > 0) {
			f = f * n;
			n--;
		}
		return f;
	}

}
