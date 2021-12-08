package spring_aop.aspectj_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring_aop/aspectj_annotation/app.xml");
		
		CustomerService cs = ac.getBean("cs", CustomerService.class);
		
		cs.printName();
		cs.printEmail();
		
		
//	    -CheckTime 클래스에 annotation을 이용해 aop를 설정한 결과-
//		당신의 이름 : HS
//		printName메서드 수행시간 : 2.168E-4초
//		당신의 Email : suny1113@naver.com
		

	}

}
