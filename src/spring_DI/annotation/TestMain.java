package spring_DI.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// @Autowired 어노테이션을 이용해 의존성 주입
public class TestMain {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring_DI_annotation/application.xml");
		
		Plain p = ac.getBean("p", Plain.class);
		
		p.fly();

	}

}
