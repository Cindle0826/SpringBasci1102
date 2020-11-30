package com.mycompany.springbasic1102.jpa.entities.many2one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")  //不寫Table名稱代表 資料庫跟class名稱一樣
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(name = "LAST_NAME",length = 50,nullable = false) //資料庫欄位名稱 aa_bb java aaBb
    private String lastName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", lastName=" + lastName + '}';
    }
    
    
}
