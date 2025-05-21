package sec06.exam06;

public class Car {
	// Field => 특별한 이유가 없으면 private
	private int speed;
	private boolean stop;
	
	// Method
	public int getSpeed() { // getter만 존재하면 readonly field
		return speed;
	}
	
	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
			return;
		}
		
		this.speed = speed;
	}

	// Quiz: Getter/Setter 만들기
	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		
		if (stop) {
			speed = 0;
		}
	}
}
