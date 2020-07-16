package com.yvan.shoppingBackend.dao;

import java.util.List;

import com.yvan.shoppingBackend.dto.Category;

public interface CategoryDao {

	
	List<Category> list();
	Category get(int id);
}
