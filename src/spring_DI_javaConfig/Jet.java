package spring_DI_javaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Jet implements Plain {

	@Autowired
	@Qualifier("m")
	Missile m;
	
	@Override
	public void takeoff() {
		System.out.println("이륙");
		
	}

	@Override
	public void landing() {
		System.out.println("착륙");
		
	}

	@Override
	public void fly() {
		System.out.println("비행중..");
		m.fire();
	}

}
