package minjiework1;

public class MinjieWork1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
            c = a + b;			//��3������ֵ����ǰ�������ĺ�
            a = b;			//��2������ֵ��ֵ����1����
            b = c;			//��3������ֵ��ֵ����2����
        }
        return c;
    }
}
