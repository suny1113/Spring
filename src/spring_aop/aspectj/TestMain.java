package spring_aop.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring_aop/aspectj/app.xml");
		
		CustomerService cs = ac.getBean("cs", CustomerService.class);
		
		cs.printName();
		cs.printEmail();
		
		// aspect를 printName 메서드에만 지정한 결과
//		당신의 이름 : HS
//		메서드 수행시간 : 2.284E-4초 ( printName 메서드에만 공통기능이 수행되었다. )
//		당신의 Email : suny1113@naver.com
	}

}
