package ex4;

import java.util.List;

public class Aquarium extends Zone {

	
	public double calculerKgsNourritureParJour(){
		return animaux.size() * 0.2;
	}
}
