package spring_DI_javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// java config로 의존성 주입하기
public class TestMain {
	
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Plain p = ac.getBean("p", Plain.class);
		
		p.fly();
	}
	
}
