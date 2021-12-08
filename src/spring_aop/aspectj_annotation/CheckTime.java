package spring_aop.aspectj_annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.util.StopWatch;

@Aspect
public class CheckTime {

	// 적용시점
	@Pointcut("execution (public void printName(..))")
	public void publicTarget() {}
	
	@Around("publicTarget()")
	public Object CheckMethodTime(ProceedingJoinPoint pjp) throws Throwable {
		
		String methodName = pjp.getSignature().getName();
		
		StopWatch sw = new StopWatch();
		
		sw.start();
		
		Object obj = pjp.proceed();
		
		sw.stop();
		
		System.out.println(methodName+"메서드 수행시간 : "+sw.getTotalTimeSeconds()+"초" );
		
		
		return obj;
	}
}
