package Exception;

public class ExceptionApp {

	public static void main(String[] args) {
		//Error  VS   Exception 
		//환경,운영체제 / 사용자가 예상하지 못한 상황
		
		System.out.println(1);
		
		int[] scores = {10,20,30};
			
		//Exception 대응 코드
		try {
			System.out.println(2);
		//	System.out.println(scores[3]);
			System.out.println(3);
			System.out.println(2/0);
			System.out.println(4);
		}catch(ArithmeticException e) {
			System.out.println("계산이 잘못된 것 같아요"+e.getMessage());
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("뭔가 이상합니다. 오류가 발생했습니다");
		}
			System.out.println(5);
	}
}
