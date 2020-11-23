package aop;

import com.mycompany.springbasic1102.aop.BMI;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    @Test
    public void v2(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("aop-config.xml");
        BMI bmi= ctx.getBean("BMIImpl",BMI.class);
        System.out.println(bmi.Calc(172.0, 65.0));
        ctx.close();
   } 
}
