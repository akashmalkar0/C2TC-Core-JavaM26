package lambda;

interface MyInterface1{
	int meth(int ...num);
	
}
public class InterfaceLambda {
	public static void main (String []args) {
	MyInterface1 m = (int ...num)->{
		int add = 0;
		int i =1;
		for(int a:num) {
		System.out.println("Number "+i+" Is : "+a);
		add+=a;
		i++;
		}return add;
	} ;
	System.out.println("Addition Of All Number Is : "+(m.meth(99,88,74,67)));
	}
}
