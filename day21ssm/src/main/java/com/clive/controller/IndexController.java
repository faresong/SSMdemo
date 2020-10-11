package com.clive.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.clive.bean.Items;
import com.clive.service.ItemService;

@Controller
public class IndexController {
	@Autowired
	private ItemService itemService;
	@RequestMapping("/itemList")
	public ModelAndView showIndex(){
		List<Items> itemList = itemService.findAll();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("itemList");
		modelAndView.addObject("itemList", itemList);
		return modelAndView;
	}
	
	@RequestMapping("/itemList2")
	public ModelAndView showIndex2(){
		System.out.println("showIndex2");
		return null;
	}
}
