package com.te.spring.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Aspect
/*
 * this annotation tell the spring to this class is an aspect
 */
public class LoggingAspect {

	//@Before("execution (public String getName())")
	/*
	 * public String getName() == method present in both the class irrespective of the classes  name it will print 
	 *  aspect before we call this method 
	 */
//	public void loggingAdvice() {
//		System.out.println("Advice run....before the getName Method ");
//	}
//	
	
//	@Before("execution(public String com.te.spring.aop.model.Circle.getName())")
//	/*
//	 * Now this aspect method will be called when we call the particular class Method -- Circle.getName()
//	 */
//	public void loggingAdvice() {
//		System.out.println("Advice run....before the getName Method ");
//	}
//	

	
//    FIRST SCENARIO -- SINGLE ASPECT METHOD FOR DIFFERENT METHODS(POINT CUTS)
	/*
	 * pointcut ----- "execution(public * get*())
	 * POINTCUT == it is a aop terminalogy for all points in the execution of ur code where you want 
	 * aspect method to be cutin
	 */
	
//	@Before("execution(public * get*())") // irrespective of return type and the method name which starts from get
	//@Before("execution(* get*())") // irrespective of the visibility of the getMethod
//	@Before("execution(* get*(*))") //needs a one or more arguments
//	@Before("execution(* get*(..))") //.. denotes it can be 0 arguments or having any arguments it will accept
	
	
//	@Before("execution(* com.te.spring.aop.model.*.get*(..))")
//	//this will print the whatever the class present in that model package and match with the method starts with get
//	//which is having 0 or any arguments this aspect method will be called
//	public void loggingAdvice() {
//		System.out.println("Advice run....before the getName Method ");
//	}
//	

	
	
//    SECOND SCENARIO -- FOR ONE POINT OF EXECUTION MULTIPLE ASPECTS METHODS CAN BE EXECUTION
	
	//IN THI9S SCENARIO WE ARE USING THE POINTCUTS
	

//	@Before("allData() && allCirclesmethods()")
//	//this will print the whatever the class present in that model package and match with the method starts with get
//	//which is having 0 or any arguments this aspect method will be called
//	public void loggingAdvice() {
//		System.out.println("Advice run....before the getName Method ");
//	}
	

//	@Before("allData()")
//	//this will print the whatever the class present in that model package and match with the method starts with get
//	//which is having 0 or any arguments this aspect method will be called
//	public void secondAdvice() {
//		System.out.println("Second Advice run... ");
//		
//	}
//	
//	@Pointcut("execution(* get*())")
//	//this will work like a when we call allData pointcut is mentioned for that method
//	public void allData() {}
//	
/*
 * IF WE WANT TO EXECUTED THE POINTCUT METHODS FOR THE PARTICULAR CLASS METHODS
 * 
 */
	
	
	

//   @Pointcut("within(com.te.spring.aop.model.Circle)")
//	public void allCirclesmethods() {}
	
   
// 	JOINPOINTS AND ADVICE ARGUMENTS
   
 
//   @Before("allCirclesmethods()")
//	public void loggingAdvice(JoinPoint joinPoint) {
//		//System.out.println("Advice run....before the getName Method ");
////	   System.out.println(joinPoint.toString());
//	   System.out.println(joinPoint.getTarget());
//	}
   
  
//   
//   @Pointcut("within(com.te.spring.aop.model.Circle)")
//	public void allCirclesmethods() {}
//   
	
	
//	 @Before("args(name)")
//	@After("args(name)")
//	@AfterReturning("args(name)")//execute the advice if the method executed successfully without throwing any exception
//      //this advice not excecuted if method throws any exception	
//	   public void getData(String name) {
//		   System.out.println("the set Method will Be called" +name );
//	   }
	
//	@AfterThrowing("args(name)")
//	/*
//	 * this advice will be executed after pointcut method is thrown an error
//	 * output :-- first an exception is thrown 
//	 *            then the advice can be executed
//	 */
//	public void getName(String name) {
//		System.out.println("An Exception Can be Thrown");
//	}
   
//	@AfterReturning(pointcut = "args(name)",returning = "returnString")
//	public void getData(String name,String returnString) {
//		System.out.println("The SetMethod wil be exeuted when the name "+ name +"return :" +returnString);
//	}
//	
//	@AfterThrowing(pointcut = "args(name)" ,throwing = "ex")
//	public void exceptionAdvice(String name,Exception ex) {
//		System.out.println("An Exception can be Thrown :--" +ex);
//	}
	
//	@Around("allData()")
//	@Around("@annotation(com.te.spring.aop.aspects.Loggable)") 
	//this execute the advice method  where pointcut method annoatated with that  loggable annotation
	public Object methodData(ProceedingJoinPoint proceedingJoinPoint) {
		Object returnValue = null;
		try {
			System.out.println("Before Advice...");
			 returnValue = proceedingJoinPoint.proceed();
			System.out.println("After Advice....");
		} catch (Throwable e) {
			System.out.println("After Throwing");
			
		} 
		System.out.println("After Finally...");
		return returnValue;
	}
   
//	@Pointcut("execution(* set*())")
	public void allData() {}
	
}
