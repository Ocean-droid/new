package day17;

public class Derived extends Base {
  String name ="Child's name";
  
  public void sayHello() {
	  System.out.println(name);
	  System.out.println(super.name);//euta base bata aaos ani euta derived bata aaos
	  System.out.println("Say Hi from child..");//testo bela super use garne 
	  super.sayHi();
  }
}
