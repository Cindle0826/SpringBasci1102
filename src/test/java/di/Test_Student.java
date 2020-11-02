package di;

import com.mycompany.springbasic1102.di.Student;
import org.junit.Test;

public class Test_Student {

    @Test
    public void test() {
        Student s1 = new Student();
        s1.setName("Cindle");
        s1.setAge(18);
        System.err.println(s1);
        //ctrl F6 start Test
    }
}
