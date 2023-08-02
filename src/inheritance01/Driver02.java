package inheritance01;

public class Driver02 {

	public static void main(String[] args) {
		//개체 참조 변수명은 고려해서 잘 짓자! 아래는 못나게 지은 예제	
		동물 animal = new 동물();
		동물 mammalia = new 포유류();
		동물 bird = new 조류();
		동물 whale = new 고래();
		동물 bat = new 박쥐();
		동물 sparrow = new 참새();
		동물 penguin = new 펭귄();
		
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
