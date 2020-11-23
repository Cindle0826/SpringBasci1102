package com.mycompany.springbasic1102.jdbc.tx.exception;

public class InsufficientAmount extends  Exception{ //餘額不足的例外
    
    public InsufficientAmount(){
        super("餘額不足");
    }
}
