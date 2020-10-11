package com.clive.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clive.bean.Items;
import com.clive.mapper.ItemMapper;
import com.clive.service.ItemService;
@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemMapper itemMapper;
	@Override
	public List<Items> findAll() {
		List<Items> list = itemMapper.findAll();
		return list;
	}

}
