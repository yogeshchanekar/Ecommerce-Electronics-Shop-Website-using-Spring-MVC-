package com.yrc.springmvcshoppingcart.dao;

import java.util.List;

import com.yrc.springmvcshoppingcart.model.CartInfo;
import com.yrc.springmvcshoppingcart.model.OrderDetailInfo;
import com.yrc.springmvcshoppingcart.model.OrderInfo;
import com.yrc.springmvcshoppingcart.model.PaginationResult;

public interface OrderDAO {

public void saveOrder(CartInfo cartInfo);

public PaginationResult<OrderInfo> listOrderInfo(int page,
int maxResult, int maxNavigationPage);

public OrderInfo getOrderInfo(String orderId);

public List<OrderDetailInfo> listOrderDetailInfos(String orderId);

}