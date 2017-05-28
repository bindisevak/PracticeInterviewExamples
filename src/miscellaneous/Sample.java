package miscellaneous;

class Hello {
	int x=1;
	Hello(int x){
		this.x = x;
	}
	Hello(){
		
	}
	public int getValue(){
		return x;
	}
}
public class Sample {
	public static void main(String[] args) {
		Hello hl = new Hello();
		Hello h2 = new Hello(2);
		System.out.println(":"+hl.getValue());
		System.out.println(":"+h2.getValue());
		
	}
}
