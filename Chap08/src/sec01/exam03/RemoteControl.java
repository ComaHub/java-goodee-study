package sec01.exam03;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상 메서드: 실행 블록 없음
	void turnOn(); // public abstract 자동 추가
	void turnOff();
	void setVolume(int volume);
}
