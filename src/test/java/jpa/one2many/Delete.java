package jpa.one2many;

import com.mycompany.springbasic1102.jpa.entities.one2many.BookShelf;
import jpa.JPATemplate;
import org.junit.Test;

public class Delete extends  JPATemplate{
    @Test
    public void t1(){
        BookShelf bookShelf = (BookShelf) session.get(BookShelf.class, 1);
        // 若透過  cascade = CascadeType.REMOVE 可以集聯刪除
        //否則多的一方資料人會保存 外鍵的內容 = null
        session.delete(bookShelf); // 刪除1的一方
    }
}
