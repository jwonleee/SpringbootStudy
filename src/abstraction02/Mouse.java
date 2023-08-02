package abstraction02;

public class Mouse {
	public String name;
	public int age;
	public static int countOfTail = 1; //공통속성은 static 영역으로
	
	public void sing() {
		System.out.println(name + "찍찍!");
	};
}
