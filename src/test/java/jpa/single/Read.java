package jpa.single;

import com.mycompany.springbasic1102.jpa.entities.Customer;
import java.util.List;
import jpa.JPATemplate;
import org.hibernate.Query;
import org.junit.Test;

public class Read extends JPATemplate {

    @Test
    public void t1() {
        // 單筆
        Customer customer = (Customer) session.get(Customer.class, 1);
        System.out.println(customer.getId() + ", " + customer.getLastName());
        // 多筆 1
//        List list = session.createSQLQuery("SELECT * FROM Customer").list();
//        list.stream().forEach(System.out::println);
//        // 多筆2
        List<Customer> list2 = session.createQuery("from Customer").list();
        list2.stream().forEach(System.out::println);
//        // 多筆3
        Query query = session.createQuery("from Customer c where c.id >= ?");
        query.setParameter(0, 5);
        List<Customer> list3 = query.list();
        list3.stream().forEach(System.out::println);
    }
}
