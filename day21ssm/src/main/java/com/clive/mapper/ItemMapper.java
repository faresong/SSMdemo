package com.clive.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.clive.bean.Items;

public interface ItemMapper {
	@Select("SELECT * FROM items")
	List<Items> findAll();

}
