/*
 * This advice will be implemented as the Before Advice which will log the parameter values along with class and method name
 */
package net.spring.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class LogInput implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		String className = target.getClass().getName();
		String methodName = method.getName();
		
		System.out.println("Executing method "+ methodName+" of class "+className+" with following parameters");
		
		for (Object parameter : args) {
			System.out.println(parameter.getClass().getName() + " = " + parameter.toString());
		}
	}
	
	
}
