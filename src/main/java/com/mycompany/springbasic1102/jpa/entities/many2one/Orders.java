package com.mycompany.springbasic1102.jpa.entities.many2one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column
    private String orderName;
    
    // 映射單向多對一的關聯關係
    @ManyToOne
    //@ManyToOne(fetch = FetchType.LAZY) 不預先SELECT加載資料, 等到程式有使用到時才會去 SELECT
    //@ManyToOne(fetch = FetchType.EAGER) 
    // 使用 @joinColumn 來設定映射外鍵
    @JoinColumn(name = "customer_id", referencedColumnName = "id") // referencedColumnName 對映Cusomter id
    private Customer customer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Orders{" + "id=" + id + ", orderName=" + orderName + ", customer=" + customer + '}';
    }
    
    
}
