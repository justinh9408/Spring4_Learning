package com.spring4.SpringTransaction;

import com.spring4.SpringTransaction.Exception.AccountException;
import com.spring4.SpringTransaction.Exception.BookStockException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Classname BookDaoImpl
 * @Description TODO
 * @Date 2019-12-20 14:01
 * @Created by Justin
 */
@Repository("BookDao")
public class BookDaoImpl implements BookDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int findByIsbn(int isbn) {
        String sql = "SELECT price FROM book WHERE isbn = ?";
        return jdbcTemplate.queryForObject(sql, Integer.class, isbn);
    }

    @Override
    public void updateStock(int isbn) {
        String sql2 = "SELECT stock FROM book_stock WHERE isbn = ?";
        int stock = jdbcTemplate.queryForObject(sql2, Integer.class, isbn);
        if (stock == 0)
            throw new BookStockException("库存不足");
        String sql = "UPDATE book_stock SET stock = stock - 1 WHERE isbn = ?";
        jdbcTemplate.update(sql, isbn);
    }

    @Override
    public void updateAccount(int accountId, int price) {
        String sql2 = "SELECT balance FROM account WHERE id = ?";
        int balance = jdbcTemplate.queryForObject(sql2, Integer.class, accountId);
        if(balance < price)
            throw new AccountException("余额不足");
        String sql = "UPDATE account SET balance = balance - ? WHERE id = ?";
        jdbcTemplate.update(sql, price, accountId);
    }
}
