
package com.yrc.springmvcshoppingcart.dao;

import com.yrc.springmvcshoppingcart.entity.Product;
import com.yrc.springmvcshoppingcart.model.PaginationResult;
import com.yrc.springmvcshoppingcart.model.ProductInfo;

public interface ProductDAO {

public Product findProduct(String code);

public ProductInfo findProductInfo(String code);


public PaginationResult<ProductInfo> queryProducts(int page,int maxResult, int maxNavigationPage);

public PaginationResult<ProductInfo> queryProducts(int page, int maxResult,int maxNavigationPage,String likeName);

public void save(ProductInfo productInfo);}