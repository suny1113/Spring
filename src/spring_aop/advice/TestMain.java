package spring_aop.advice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		
		ApplicationContext ac1 = new ClassPathXmlApplicationContext("spring_aop/advice/app.xml");
		CustomerService cs1 = ac1.getBean("cs1", CustomerService.class);
		
		ApplicationContext ac2 = new ClassPathXmlApplicationContext("spring_aop/advice/app.xml");
		CustomerService cs2 = ac2.getBean("cs2", CustomerService.class);
		
		ApplicationContext ac3 = new ClassPathXmlApplicationContext("spring_aop/advice/app.xml");
		CustomerService cs3 = ac3.getBean("cs3", CustomerService.class);
		
		ApplicationContext ac4 = new ClassPathXmlApplicationContext("spring_aop/advice/app.xml");
		CustomerService cs4 = ac4.getBean("cs4", CustomerService.class);
		
		// 1. 메서드가 호출되기 전 공통기능(시간) 수행
		cs1.printName();
		
//		-결과-
//		2021 년 12월 08일 10시 43분 01초 호출됨
//		당신의 이름 : HS
		
		// 2. 메서드가 정상적으로 수행된 후 반환되었을때 수행
		cs2.printName();
		
//		-결과-
//		당신의 이름 : HS
//		2021 년 12월 08일 10시 53분 51초 호출됨
		
		// 3. 예외가 던저지는 시점에 수행
		cs3.printName();
		cs3.throwException();
		
//		-결과-
//		당신의 이름 : HS
//		예외 발생시점에 호출
//		Exception in thread "main" java.lang.IllegalArgumentException
		
		// 4. 메서드 실행 전후에 수행 (주로 메서드 수행시간을 확인하기 위해 사용)
		cs4.printName();
		
//		-결과-
//		당신의 이름 : HS
//		메서드 수행시간 : 1.563E-4초
	}
}
