package cn.design.pattern20160608ObserverPatternPush;

public class XX implements Observer {

	@Override
	public void feed(String info) {
		System.out.println("喂饲料！");
	}
	
}
