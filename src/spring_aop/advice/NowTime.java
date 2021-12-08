package spring_aop.advice;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;

// 메서드 호출 전 공통기능 수행
public class NowTime implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy 년 MM월 dd일 hh시 mm분 ss초 호출됨");
		
		System.out.println(sdf.format(date));
	}
	
}
