package Exception;

public class ExceptionApp {

	public static void main(String[] args) {
		//Error  VS   Exception 
		//ȯ��,�ü�� / ����ڰ� �������� ���� ��Ȳ
		
		System.out.println(1);
		
		int[] scores = {10,20,30};
			
		//Exception ���� �ڵ�
		try {
			System.out.println(2);
		//	System.out.println(scores[3]);
			System.out.println(3);
			System.out.println(2/0);
			System.out.println(4);
		}catch(ArithmeticException e) {
			System.out.println("����� �߸��� �� ���ƿ�"+e.getMessage());
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("���� �̻��մϴ�. ������ �߻��߽��ϴ�");
		}
			System.out.println(5);
	}
}
