public class Test{
	
	int h;
	final int i;
	static final int j = 4;

	public Test(){
		i = 3;	
	}
	
	public void say(){
		System.out.println("Hello. (normal)");
	}

	public static void say1(){
		System.out.println("hello. (static)");
	}

	public static void main(String[] args){
		System.out.println("test!");
		new Test().say();
		say1();

		int a = 4;
		float b = 4f;
		double c = 4;
		byte w = 0b1111111;
		byte x = 126;
		byte y = 0b111;
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(b == c);
		System.out.println("-----> " + w);
		System.out.println("-----> " + x);
		System.out.println("-----> " + y);

		String d = "test";
		String e = "test";
		System.out.println(d == e);

		String f = new String("test");
		String g = new String("test");
		System.out.println(f == g);
		System.out.println(f.equals(g));
	}
}
