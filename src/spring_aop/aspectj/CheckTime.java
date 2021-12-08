package spring_aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class CheckTime {
	public Object checkMethodTime(ProceedingJoinPoint pjp) throws Throwable {
		
		StopWatch sw = new StopWatch();
		
		sw.start();
		
		Object obj = pjp.proceed();
		
		sw.stop();
		
		System.out.println("메서드 수행시간 : "+sw.getTotalTimeSeconds()+"초");
		
		return obj;
	}
}
