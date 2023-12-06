package lambda;
interface MyInterface2{
	int meth(int ...num);
}
class VarArgs implements MyInterface2{
	@Override
	public int meth(int... num) {
		int add = 0;
		int i =1;
		for(int a:num) {
		System.out.println("Number "+i+" Is : "+a);
		add+=a;
		i++;
		}return add;
	}
}
public class WithoutLambda {
	public static void main (String []args) {
		VarArgs m = new VarArgs();
	System.out.println("Addition Of All Number Is : "+(m.meth(99,88,74)));
	
	
// Anonymous Classes 
//	MyInterface2 ref =new MyInterface2() {
//		@Override
//		public int meth(int ...num) {
//			int add = 0;
//			int i =1;
//			for(int a:num) {
//			System.out.println("Number "+i+" Is : "+a);
//			add+=a;
//			i++;
//			}return add;
//		}	
//	};
//	System.out.println("Addition Of All Number Is : "+(m.meth(25,25,25)));
//
//	
	}
}
