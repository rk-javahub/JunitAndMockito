package com.rkjavahub.orderprocessing.bo;

import com.rkjavahub.orderprocessing.bo.exception.BOException;
import com.rkjavahub.orderprocessing.dto.Order;

public interface OrderBO {

	boolean placeOrder(Order order) throws BOException;

	boolean cancelOrder(int id) throws BOException;

	boolean deleteOrder(int id) throws BOException;

}
