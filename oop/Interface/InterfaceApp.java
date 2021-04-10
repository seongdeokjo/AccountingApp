package Interface;
interface Calculable{
	double PI = 3.14;
	int sum(int v1,int v2);
}
interface Printable{
	void print();
}
//하나의 클래스로 여러가지의 인터페이스를 구현할 수 있다.
class RealCal implements Calculable,Printable{
	public int sum(int v1, int v2) {
		return v1+v2;
	}
	public void print() {
		System.out.println("This is RealCal");
	}
}
class AdvancedPirnt implements Printable{
	public void print() {
		System.out.println("This is RealCal");
	}
}
public class InterfaceApp {
	public static void main(String[] args) {
		//호환성 보장 가능 
		Printable c = new AdvancedPirnt();
		c.print();
	}
}
