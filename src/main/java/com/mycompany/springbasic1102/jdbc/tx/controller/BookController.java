package com.mycompany.springbasic1102.jdbc.tx.controller;

public interface BookController {
    void buyBook(Integer wid,Integer bid);
    void BuyBooks(Integer wid,Integer...bids);
}
