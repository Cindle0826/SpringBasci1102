package jpa.twoway;

import com.mycompany.springbasic1102.jpa.entities.twoway.Department;
import com.mycompany.springbasic1102.jpa.entities.twoway.Employee;
import jpa.JPATemplate;
import org.junit.Test;

public class Create extends JPATemplate{
    @Test
    public void t1(){
        Department dept = new Department();
        dept.setDname("IT");
        
        Employee e1 = new Employee();
        e1.setEname("Mary");
        
        Employee e2 = new Employee();
        e2.setEname("John");
        e2.setDepartment(dept);
        e2.setDepartment(dept);
        // 因為在 Department 中有設定 mapBy = "Deparement" <-- 由Employee 的 department 來維護
        dept.getEmployees().add(e1);
        dept.getEmployees().add(e2);
        //儲存
        session.persist(dept);
        session.persist(e1);
        session.persist(e2);
    }
}
