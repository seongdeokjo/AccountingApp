//���
//�θ� Ŭ����
class Cal {
	public int sum(int v1, int v2) {
		return v1+v2;
	}
	// Overloading //this�� �ڱ� �ڽ�,super�� �θ�
	public int sum(int v1, int v2,int v3) {
		return this.sum(v1,v2)+v3;
	}
}
//�ڽ� Ŭ����
class Cal2 extends Cal{
	public int minus(int v1, int v2) {
		return v1-v2;
	}
	// Overriding �����,������,�ö�Ÿ�� 
	public int sum(int v1, int v2) {
		System.out.println("Cal2!!");
		return super.sum(v1,v2);
	}
	
	
}
public class InheritanceApp {

	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println(c.sum(2,1));
		System.out.println(c.sum(2, 1, 1));
	
		Cal2 c2 = new Cal2();
		System.out.println(c2.sum(2, 1));
		System.out.println(c2.minus(2, 1));
	}
}
