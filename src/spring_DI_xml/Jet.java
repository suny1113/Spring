package spring_DI_xml;

public class Jet implements Plain {

	Missile m;
	
	// setterDI
	public void setM(Missile m) {
		this.m = m;
	}
	
	// constructorDI
//	public Jet(Missile m) {
//		super();
//		this.m = m;
//	}


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
