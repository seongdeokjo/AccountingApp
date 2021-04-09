class Foo{
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";
	public static void classMethod() {
		System.out.println(classVar); // ok
		//System.out.println(instanceVar); //Error
	}
	public void instanceMethod() {
		System.out.println(classVar); // ok
		System.out.println(instanceVar); //Error
	}
}
public class StaticApp {

	public static void main(String[] args) {
		System.out.println(Foo.classVar);	//ok
//		System.out.println(Foo.instanceVar); //Error
		Foo.classMethod();
//		Foo.instanceMethod();
		
		//f1,f2 instance create!
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		f1.instanceVar = "hi";
		f1.classVar = "bye";
		System.out.println(f1.instanceVar); //hi
		System.out.println(f2.instanceVar);// i instance var
		System.out.println(f1.classVar); // bye <--static의 효과로 class 값 모두 변경됨 
		System.out.println(f2.classVar); // bye 
	
		
	}

}
