package homework.homework03.run;

import homework.homework03.model.vo.Car;
import homework.homework03.model.vo.ElectricEngine;
import homework.homework03.model.vo.GasolineEngine;

public class Run {
	public static void main(String[] args) {
		Car car1 = new Car(new GasolineEngine());
		Car car2 = new Car(new ElectricEngine());
		
		car1.startEngine();
		car2.startEngine();
	}
}
