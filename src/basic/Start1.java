package basic;

//java.lang + 클래스들이 stack 영역에 할당
public class Start1 {

	//main( 이때 stack frame을 stack 영역에 할당 
	//stack frame의 맨 밑에 메서드의 인자 args를 저장할 변수 공간을 확보
	public static void main(String[] args) {
		System.out.println("Hello OOP!");
	}
}
