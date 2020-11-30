package jpa.single;

import com.mycompany.springbasic1102.jpa.entities.many2one.Customer;
import jpa.JPATemplate;
import org.hibernate.Query;
import org.junit.Test;

public class Update extends  JPATemplate{
    @Test
    public void t1() {
        Customer customer = (Customer)session.get(Customer.class, 1);
        customer.setLastName("AAA");
        // 物件修改
        Customer c2 = new Customer();
        c2.setId(2);
        c2.setLastName("BBB");
        session.update(c2);
        // 下達 SQL 修改
        String sql = "UPDATE Customer SET last_Name = :lastName WHERE ud = :id";
        Query query = session.createQuery(sql);
        query.setParameter("lastName", "CCC");
        int updateRowCount =  query.executeUpdate(); //異動比數
        System.out.println("UpdateRowCount = " + updateRowCount);
    }
}
