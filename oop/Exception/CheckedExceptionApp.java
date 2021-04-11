package Exception;


import java.io.FileWriter;
import java.io.IOException;


public class CheckedExceptionApp {
	public static void main(String[] args) {
		FileWriter f = null ;
		try {
			f = new FileWriter("data3.txt");
		f.write("Hello,GoodMorning");
		// close�� �ϱ� ���� ���ܰ� �߻��� �� �ֱ� ������ finally�� ó���ؾ� �մϴ�.
		
		}catch(IOException e) {
			e.printStackTrace();
		} finally {
			//���࿡ f�� null�� �ƴ϶��
			if(f != null) {
				try {
				f.close();
			} catch(IOException e) {
				e.printStackTrace();
				}
			}
		}
	}
}
