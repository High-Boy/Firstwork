package minjiework1;

public class MinjieWork1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		for(int i=1;i<15;i++) {
			if(Fibonacciof(i)>200) {
				break;
			}
			else {
				System.out.print(Fibonacciof(i)+"\t");
			}
		}
	}
	public static int Fibonacciof(int n) {
        if (n < 1) {
            return -1;
        }
        if (n ==1 || n == 2) {
            return 1;
        }

        int a =1, b= 1, c =0;		
        for (int i = 0; i < n - 2; i++) {
            c = a + b;			//第3个数的值等于前两个数的和
            a = b;			//第2个数的值赋值给第1个数
            b = c;			//第3个数的值赋值给第2个数
        }
        return c;
    }
}
