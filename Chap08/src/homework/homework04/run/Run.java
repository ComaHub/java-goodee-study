package homework.homework04.run;

import homework.homework04.model.vo.GalaxyS24;
import homework.homework04.model.vo.Iphone15;
import homework.homework04.model.vo.SmartPhone;

public class Run {
	public static void main(String[] args) {
		SmartPhone[] smartPhones = new SmartPhone[2];
		
		smartPhones[0] = new GalaxyS24();
		smartPhones[1] = new Iphone15();
		
		for (int i = 0; i < smartPhones.length; i++) {
			smartPhones[i].printMaker();
			smartPhones[i].makeCall();
			smartPhones[i].takeCall();
			smartPhones[i].touch();
			smartPhones[i].charge();
			smartPhones[i].picture();
			
			System.out.println();
		}
	}
}
