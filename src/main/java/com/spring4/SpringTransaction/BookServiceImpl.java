package com.spring4.SpringTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Classname BookServiceImpl
 * @Description TODO
 * @Date 2019-12-20 14:20
 * @Created by Justin
 */
@Service("bookService")
public class BookServiceImpl implements BookService {

    @Autowired
    BookDao bookDao;


//    事务注解
//    propagation：指定事务传播行为，即当本事务被另外一个事务调用时，如何使用事务
//      - Required指定使用调用方法的事务
//      - Requires_New指定使用新开的事务
//    readOnly：只读数据事务，帮助事务优化
//    timeout：超过时间强制回滚
    @Transactional(propagation = Propagation.REQUIRED,
                    readOnly = false,
                    timeout = -1)
    @Override
    public void purchase(int isbn, int accountId) {

        int price = bookDao.findByIsbn(isbn);

        bookDao.updateStock(isbn);

        bookDao.updateAccount(accountId, price);
    }
}
