package com.clive.service;

import java.util.List;

import com.clive.bean.Items;

public interface ItemService {
	/**
	 * 查询所有商品信息
	 * @return
	 */
	List<Items> findAll();
}
