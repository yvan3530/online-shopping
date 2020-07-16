package com.yvan.shoppingBackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.yvan.shoppingBackend.dao.CategoryDao;
import com.yvan.shoppingBackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDaoImpl implements CategoryDao {

	private static List<Category> categories= new ArrayList<>();
	
	
	static {
		
		Category category = new Category();
		
		category.setId(1);
		category.setName("Television");
		category.setDescription("describ television");
		category.setImageURL("Cat_1.png");
		
		categories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setName("mobile");
		category.setDescription("describ mobile");
		category.setImageURL("Cat_2.png");
		
		categories.add(category);
		
		category = new Category();
		category.setId(3);
		category.setName("television");
		category.setDescription("describ television");
		category.setImageURL("Cat_3.png");
		
		categories.add(category);
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {

		for(Category category : categories) {
			if(category.getId() ==id) return category;
		}
		
		return null;
		
	}

}
