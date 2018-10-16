package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.apache.log4j.*;

@Aspect
public class AOP {
	static Logger log = Logger.getLogger(AOP.class.getName());
	
//	@Before("execution(* bean.RegisterBean.register(..))")
//	public void beforeAddMethod(final JoinPoint joinPoint) { 
//		System.out.println("Test");
//			log.fatal("Adding Student..." + joinPoint.getTarget().getClass().getSimpleName()
//	                + "'s "
//	                + joinPoint.getSignature().getName()
//	                + " ");
//	    } 

	@Around("within(bean.RegisterBean)")
	    public Object aroundRegister(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
	        log.fatal("Registering Student..." + proceedingJoinPoint.getTarget().getClass().getSimpleName()
	                + "'s "
	                + proceedingJoinPoint.getSignature().getName()
	                + " ");
	        Object o = proceedingJoinPoint.proceed();
	        return o;
	    }
	
	@Around("within(bean.SignInBean)")
    public Object aroundSignIn(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        log.fatal("Registering Student..." + proceedingJoinPoint.getTarget().getClass().getSimpleName()
                + "'s "
                + proceedingJoinPoint.getSignature().getName()
                + " ");
        Object o = proceedingJoinPoint.proceed();
        return o;
    }
	
	@Around("within(bean.ListBean)")
    public Object aroundList(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        log.fatal("Listing Student..." + proceedingJoinPoint.getTarget().getClass().getSimpleName()
                + "'s "
                + proceedingJoinPoint.getSignature().getName()
                + " ");
        Object o = proceedingJoinPoint.proceed();
        return o;
    }
	
	@Around("within(bean.DeleteBean)")
    public Object aroundDelete(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        log.fatal("Deleting Student..." + proceedingJoinPoint.getTarget().getClass().getSimpleName()
                + "'s "
                + proceedingJoinPoint.getSignature().getName()
                + " ");
		Object o = proceedingJoinPoint.proceed();
	    return o;
    }
	
	@Around("within(bean.UpdateBean)")
    public Object aroundUpdate(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        log.fatal("Updating Student..." + proceedingJoinPoint.getTarget().getClass().getSimpleName()
                + "'s "
                + proceedingJoinPoint.getSignature().getName()
                + " ");
        Object o = proceedingJoinPoint.proceed();
        return o;
    }


	
	
}
