package sec01.exam04;


public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane ssa = new SupersonicAirplane();
		
		ssa.takeOff();
		ssa.fly();
		
		ssa.flyMode = SupersonicAirplane.SUPERSONIC;
		ssa.fly();
		
		ssa.flyMode = SupersonicAirplane.NORMAL;
		ssa.fly();
		
		ssa.land();
	}
}
