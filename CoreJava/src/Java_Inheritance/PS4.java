package Java_Inheritance;

public class PS4 { //another utility class as requested by clients

	
	int a;
	
	public PS4(int a) {
		// TODO Auto-generated constructor stub
		
		this.a=a; 
	}


	public int multiplyTwo() {
		a=a*2;
		System.out.println("Branch development 3");
		return a;
	}
	

	public int multiplyThree() {
		a=a*3;
		System.out.println("new ages");
		System.out.println("Branch development 4");
		return a;
	}
}
