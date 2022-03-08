package propertyManage.control;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CheckLogin {
	
    @Pointcut("within(propertyManage.control.business.*)")
    public void pointcut(){}
    
    @Around("pointcut()")
    public Object  AroundControl(ProceedingJoinPoint jointPoint) throws Throwable{
        System.out.println("前置通知生效!!!"+jointPoint.getSourceLocation());
        
     //   HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
       
        //HumanResourceBean humanResourceBean= (HumanResourceBean)request.getSession().getAttribute(PropertyConstant.USER_INFO);
        
       // System.out.println("SysName="+humanResourceBean.getSysName());
        
        Object[] argus=jointPoint.getArgs();
//        for (Object object :argus) {
//        	if (object instanceof Map) {
//        	object=new HashMap();
//        		((Map) object).put("OK", "NG");
//        		System.out.println(" AroundControl Map!!!"+((Map) object).get("OK"));
//        		
//        	}
//        }
        return jointPoint.proceed();
    }

}
