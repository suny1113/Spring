package spring_DI.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Jet implements Plain{

	@Autowired
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
		System.out.println("비행중");
		m.fire();
		
	}

}
