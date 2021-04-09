 class Print {
	// class member delimiter,A,B
	 // instance는 class 와 내부적으로는 같다.
	 //instance는 class의 복제본으로 이름을 붙여야한다.
	 //이름이 다른 instance들은 각각 다른 값을 지정할 수 있다.
	 //static 메소드는 클래스에 속하는 메소드이기때문에 다른 클래스에 상속이 불가능하다. 
		public String delimiter ="";
		//생성자 
		public Print(String delimiter) {
			this.delimiter  = delimiter;// this=클래스안에 인스턴스를 가르킨다.
		}
		public  void A() {
			System.out.println(this.delimiter);
			System.out.println("A");
			System.out.println("A");
		}

		public  void B() {
			System.out.println(this.delimiter);
			System.out.println("B");
			System.out.println("B");
		}
}

public class MyOOP {
	public static void main(String[] args) {
		Print p1 = new Print("****");
		p1.A();
		p1.A();
		p1.B();
		p1.B();
		 
		Print p2 = new Print("----");
		p2.A();
		p2.A();
		p2.B();
		p2.B();
		
		p1.A();
		p2.A();
		p1.B();
		p2.B();
			
	}
	
	

}
