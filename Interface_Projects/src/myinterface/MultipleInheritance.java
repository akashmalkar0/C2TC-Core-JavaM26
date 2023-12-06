package myinterface;

public class MultipleInheritance extends Samsung implements Phone, Connectivity {

	@Override
	public String type() {
		return "4G";
	}

	@Override
	public String processor() {
		return "SD900";
	}

	@Override
	public int space() {
		return 256;
	}

	public static void main(String[] args) {
		MultipleInheritance m = new MultipleInheritance();
		System.out.println(m.type());
		System.out.println(m.processor());
		System.out.println(m.space());
		
	}
}
