package com.roncoo.eshop.product.service;

import com.roncoo.eshop.product.model.ProductInventory;

public interface ProductInventoryService {

	public void add(ProductInventory productInventory);

	public void update(ProductInventory productInventory);

	public void delete(Long id);

	public ProductInventory findById(Long id);
}
