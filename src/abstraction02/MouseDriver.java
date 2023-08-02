package abstraction02;

public class MouseDriver {

	//클래스의 멤버 메서드 - static, 밑줄
	public static void main(String[] args) {
		//클래스명.countOfTail
		Mouse.countOfTail = 1;
		
		Mouse mickey = new Mouse();
		Mouse jerry = new Mouse();
		Mouse mightyMouse = new Mouse();
		
		//객체명.countOftail
		System.out.println(mickey.countOfTail);
		System.out.println(jerry.countOfTail);
		System.out.println(mightyMouse.countOfTail);
		
		//클래스명.countOfTail
		System.out.println(Mouse.countOfTail);
	}
}
