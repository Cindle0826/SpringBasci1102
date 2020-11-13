package com.mycompany.springbasic1102.aop;

import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1) //數字越小越好
public class LogAspect {
    
    @Pointcut(value = "execution( * com.mycompany.springbasic1102.aop.*.*(..))")
    public void cut(){
        
    }
    
    // 執行在方法前 前置通知(advice) 
    //@Before(value = "execution(public int com.mycompany.springbasic1102.aop.CalcImpl.*(int , int ))")// 切入點表達式
    @Before(value = "cut()") 
    public void before(JoinPoint joinPoint){
        System.out.println("前置通知:");
        //獲取方法名稱
        String  methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.printf("前置通知 -> 方法名稱: %s,方法參數: %s\n",methodName,Arrays.toString(args));
    }
    
    // 後置通知
    //無論是否有例外發生例外都會被執行,因後置通知作用在finally 中..
    @After(value = "cut()") //切入點參照
    public void after(){
        System.out.println("後置通知");
    }
    
    //返回通知(advice)
    //獲取返回值
    @AfterReturning(value = "cut()",returning = "result")
    public void afterReturning(Object result){
        System.out.printf("返回通知: result= %s\n",result);
    }
    
    // 例外通知
    @AfterThrowing(value = "cut()", throwing = "ex")
    public void afterThrowing(Exception ex){
        System.out.printf("例外通知 : ex = %s\n",ex);
    }
}
