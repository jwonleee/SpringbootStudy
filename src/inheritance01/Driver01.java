package inheritance01;

public class Driver01 {

	public static void main(String[] args) {
		//개체 참조 변수명은 고려해서 잘 짓자! 아래는 못나게 지은 예제
		동물 animal = new 동물();
		포유류 mammalia = new 포유류();
		조류 bird = new 조류();
		고래 whale = new 고래();
		박쥐 bat = new 박쥐();
		참새 sparrow = new 참새();
		펭귄 penguin = new 펭귄();
		
		//상속 후 생성자 초기화만 해주면 showMe() 메서드를 다시 작성하지 않아도 사용 가능
		animal.showMe();
		mammalia.showMe();
		bird.showMe();
		whale.showMe();
		bat.showMe();
		sparrow.showMe();
		penguin.showMe();
	}
}
