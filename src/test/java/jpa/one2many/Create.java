package jpa.one2many;

import com.mycompany.springbasic1102.jpa.entities.one2many.Book;
import com.mycompany.springbasic1102.jpa.entities.one2many.BookShelf;
import java.util.Date;
import jpa.JPATemplate;
import org.junit.Test;

public class Create extends JPATemplate {

    @Test
    public void t1() {
        Book b1 = new Book();
        b1.setName("Android雲端");
        b1.setPrice(50);
        b1.setCt(new Date());
        Book b2 = new Book();
        b2.setName("Android穿戴式");
        b2.setPrice(150);
        b2.setCt(new Date());
        BookShelf bookShelf = new BookShelf();
        bookShelf.setName("App類");

        // 建立關聯關係
        bookShelf.getBooks().add(b1);
        bookShelf.getBooks().add(b2);

        //儲存
        //下面兩種都可以
        session.persist(bookShelf);
        session.persist(b1);
        session.persist(b2);

//        session.persist(b1);
//        session.persist(b2);
//        session.persist(bookShelf);

    }
}
