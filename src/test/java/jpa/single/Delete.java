package jpa.single;

import com.mycompany.springbasic1102.jpa.entities.many2one.Customer;
import jpa.JPATemplate;
import org.junit.Test;

public class Delete  extends  JPATemplate{
    @Test
    public  void t1() {
        Customer c = (Customer) session.get(Customer.class, 2);
        session.delete(c);
    }
}
