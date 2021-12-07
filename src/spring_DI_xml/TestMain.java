package spring_DI_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring_DI_xml/application.xml");
		
		Plain p = ac.getBean("p", Plain.class);
		
		p.fly();

	}

}
