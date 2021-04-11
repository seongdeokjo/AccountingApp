package Exception;


import java.io.FileWriter;
import java.io.IOException;


public class TryWithResource {
	public static void main(String[] args) {
		//try with resource statements
		try(FileWriter f = new FileWriter("data3.txt")){
			f.write("Hello,GoodMorning");			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}