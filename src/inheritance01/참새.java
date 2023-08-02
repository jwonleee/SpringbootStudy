package inheritance01;

public class 참새 extends 조류 implements 날수있는{

	참새() {
		myClass = "참새";
	}

	@Override
	public void fly() {
		System.out.println(myClass + "날고있는 슈욱슈욱!");
	}
}
