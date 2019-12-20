package com.spring4.SpringTransaction;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;

/**
 * @Classname TransactionTest
 * @Description TODO
 * @Date 2019-12-20 14:11
 * @Created by Justin
 */
public class TransactionTest {

    ApplicationContext ctx = null;
    BookDao bookDao;
    BookService bookService;
    CashierService cashierService;

    {
        ctx = new ClassPathXmlApplicationContext("META-INF/applicationContext-JDBC.xml");
        bookDao = ctx.getBean(BookDao.class);
        bookService = ctx.getBean(BookService.class);
        cashierService = ctx.getBean(CashierService.class);
    }


    @Test
    public void testPropagation(){
        cashierService.checkout(1, Arrays.asList(1001,1002));
    }

    @Test
    public void testBookService(){
        bookService.purchase(1001,1);
    }

    @Test
    public void testFindByIsbn(){
        System.out.println(bookDao.findByIsbn(1001));
    }

    @Test
    public void testUpdateAccount(){
        bookDao.updateAccount(1, 1);
    }

    @Test
    public void updateStock(){
        bookDao.updateStock(1001);
    }

}
