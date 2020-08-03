package day17;

public class Test1 {
	public static void main(String[] args) {
		Parent obj = new Parent();
		obj.sayHello();
		System.out.println(obj.name);
		
		Child child = new Child(); //due to inheritance and extends keyword 
		child.sayHello();
		System.out.println(child.name);
	}
}
//inherit nahune kura haru : private member ,hidden variable , overridden method
//we cannot inherit private members