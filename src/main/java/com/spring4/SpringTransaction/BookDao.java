package com.spring4.SpringTransaction;

/**
 * @Classname BookDao
 * @Description TODO
 * @Date 2019-12-20 13:59
 * @Created by Justin
 */
public interface BookDao {
    int findByIsbn(int isbn);

    void updateStock(int isbn);

    void updateAccount(int accountId, int price);
}
