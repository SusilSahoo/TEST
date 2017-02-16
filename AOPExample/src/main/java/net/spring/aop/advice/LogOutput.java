/*
 * This advice will be implemented as the After Advice which will log the return value along with the class and method name
 */
package net.spring.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class LogOutput implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args,
            Object target) throws Throwable {
		
		String className = target.getClass().getName();
        String methodName = method.getName();
        
        System.out.println("Returning from method "+methodName+" of class "+className+" with "+returnValue.toString());
		
	}

}
