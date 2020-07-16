package com.yvan.onlineShopping.controller;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yvan.shoppingBackend.dao.CategoryDao;
import com.yvan.shoppingBackend.dto.Category;



@Controller
public class PageController {
	
	@Autowired
	private CategoryDao categoryDAO;

	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index() {
		 
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Home");
		
		mv.addObject("categories", categoryDAO.list());
		
		mv.addObject("userClientHome",true);
		return mv;
	}
	
	@RequestMapping(value = {"/about"})
	public ModelAndView about() {
		 
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","About us");
		mv.addObject("userClientAbout",true);
		return mv;
	}
	
	@RequestMapping(value = {"/contact"})
	public ModelAndView contact() {
		 
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Contact us");
		mv.addObject("userClientContact",true);
		return mv;
	}
	
	
	
	
	
	
	
	@RequestMapping(value = "/show/all/products")
	public ModelAndView showAllProducts() {
		 
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","All Products");
		
		mv.addObject("categories", categoryDAO.list());
		
		mv.addObject("userClientAllProducts",true);
		return mv;
	}
	
	
	@RequestMapping(value = "/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
		 
		ModelAndView mv = new ModelAndView("page");
		
		Category category= null;
		category = categoryDAO.get(id);
		
		mv.addObject("title",category.getName());
		
		mv.addObject("categories", categoryDAO.list());
		
		mv.addObject("category", category );
		
		mv.addObject("userClientCategoryProducts",true);
		return mv;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@RequestMapping(value="/test")
//	public ModelAndView test(@RequestParam(value="greeting", required=false) String greeting) {
//		
//		if(greeting==null) {
//			greeting = "Hollo there";
//		}
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("greeting", greeting);
//		return mv;
//	}
//	
//	@RequestMapping(value="/test/{greeting}")
//	public ModelAndView test(@PathVariable("greeting") String greeting) {
//		
//		if(greeting==null) {
//			greeting = "Hello there";
//		}
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("greeting", greeting);
//		return mv;
//	}
	
	
	
	
}
