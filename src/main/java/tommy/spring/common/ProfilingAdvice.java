package tommy.spring.common;

import org.aspectj.lang.ProceedingJoinPoint;

public class ProfilingAdvice {// 공통기능을 제공할 Advice클래스
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable{
		String signatureString = joinPoint.getSignature().toShortString();
		System.out.println(signatureString + "시작");
		long start = System.currentTimeMillis();
		try {
			Object result = joinPoint.proceed();
			return result;
		}finally {
			long finish = System.currentTimeMillis();
			System.out.println(signatureString + " 종료");
			System.out.println(signatureString + " 실행 시간 : " + (finish - start) + "ms");
		}
	}
}
