package spring_aop.advice;

import org.springframework.aop.ThrowsAdvice;

public class ThrowExcept implements ThrowsAdvice {

	public void afterThrowing(IllegalArgumentException e) {
		System.out.println("예외 발생시점에 호출");
	}
}
