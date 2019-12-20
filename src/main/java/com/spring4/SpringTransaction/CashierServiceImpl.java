package com.spring4.SpringTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Classname CashierServiceImpl
 * @Description TODO
 * @Date 2019-12-20 14:59
 * @Created by Justin
 */
@Service("cashierService")
public class CashierServiceImpl implements  CashierService {

    @Autowired
    BookService bookService;

    @Override
    public void checkout(int accountId, List<Integer> books) {
        for (Integer isbn : books){
            bookService.purchase(isbn, accountId);
        }
    }
}
