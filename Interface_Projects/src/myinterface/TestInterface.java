package myinterface;

interface Phone {
	String processor();
	int space();

}

class Samsung implements Phone{

	@Override
	public String processor() {
		return "SD1000";
	}

	@Override
	public int space() {
		return 256;
	}}

class Oppo implements Phone{

	@Override
	public String processor() {
		return "Helio G80";
	}

	@Override
	public int space() {
		return 128;
	}
	
}
public class TestInterface {

	public static void main(String[] args) {
		Samsung s = new Samsung();
		Oppo o = new Oppo();
		System.out.println("Samsung Processor : "+s.processor());
		System.out.println("Samsung Space : "+s.space());

		System.out.println("Samsung Processor : "+o.processor());
		System.out.println("Samsung Space : "+o.space());
		
	}

}
