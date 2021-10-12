package ch04;

public interface Tire {
	public void roll();
}

class HankookTire implements Tire{

	@Override
	public void roll() {
		System.out.println("한국 타이어가 굴러간다.");
	}
	
}


class KumhoTire implements Tire{

	@Override
	public void roll() {
		System.out.println("금호 타이어가 굴러란다.");
	}
	
}