package spring_aop.advice;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.aop.AfterReturningAdvice;

public class NowTime2 implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {

		Date date = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy 년 MM월 dd일 hh시 mm분 ss초 호출됨");

		System.out.println(sdf.format(date));

	}

}
