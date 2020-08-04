package day17;

public class Sub extends Super {
   public Sub() {
	   super(5);
	   System.out.println("child's default constructor");
   }
   public Sub (int a) {
	   super();
	   System.out.println("child's arg constructor");
   }
   
}
