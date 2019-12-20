package com.spring4.SpringTransaction;

import java.util.List;

/**
 * @Classname CashierService
 * @Description TODO
 * @Date 2019-12-20 14:58
 * @Created by Justin
 */
public interface CashierService {

    void checkout(int accountId, List<Integer> books);
}
