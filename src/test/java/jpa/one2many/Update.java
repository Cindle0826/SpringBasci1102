package jpa.one2many;

import com.mycompany.springbasic1102.jpa.entities.one2many.BookShelf;
import jpa.JPATemplate;
import org.junit.Test;

public class Update extends  JPATemplate{
    @Test
    public void t1(){
        BookShelf bookShelf = (BookShelf) session.get(BookShelf.class, 1);
        bookShelf.getBooks().get(0).setPrice(500);
    }
}
