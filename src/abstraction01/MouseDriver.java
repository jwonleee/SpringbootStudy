package abstraction01;

public class MouseDriver {

	//클래스의 멤버 메서드 - static, 밑줄
	public static void main(String[] args) {
		Mouse mickey = new Mouse();
		mickey.name = "미키";
		mickey.age = 15;
		mickey.countOfTail = 1;
		
		//객체의 멤버 메서드 - 밑줄x
		mickey.sing();
		
		mickey = null;
		
		Mouse jerry = new Mouse();
		jerry.name = "제리";
		jerry.age = 50;
		jerry.countOfTail = 1;
		
		jerry.sing();
	}
}
