package ex4;

import java.util.List;

public class ZoneCarnivore extends Zone {


	public double calculerKgsNourritureParJour(){
		return animaux.size() * 10;
	}
}
