package com.yvan.shoppingBackend.test;

import com.yvan.shoppingBackend.dao.CategoryDao;
import com.yvan.shoppingBackend.dto.Category;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CategoryTestCase {


	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDao categoryDAO;
	
	private Category category;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.yvan.shoppingBackend");
		context.refresh();
		
		categoryDAO = (CategoryDao)context.getBean("categoryDAO");
	}
//	@Test
//	public void testAddCategory() {
//		category = new Category();
//		category.setName("Television");
//		category.setDescription("describ television");
//		category.setImageURL("Cat_1.png");
//		assertEquals("Successfull added a category inside the table", true,categoryDAO.add(category));
//	}
	
	
//@Test
//public void testGetCategory() {
//	
//	category = categoryDAO.get(1);
//	assertEquals("Successfull fetched a category from the table", "Television",category.getName());
//}


//	@Test
//	public void testUpdateCategory() {
//		
//		category = categoryDAO.get(1);
//		category.setName("TV");
//		assertEquals("Successfull update a category from the table", true,categoryDAO.update(category));
//	}

//	@Test
//	public void testDeleteCategory() {
//		
//		category = categoryDAO.get(1);
//	
//		assertEquals("Successfull deleted a category from the table", true,categoryDAO.delete(category));
//	}
//	
	
	
//	@Test
//	public void testListCategory() {
//		
//	
//	assertEquals("Successfull fetched list a category from the table", 2,categoryDAO.list().size());
//	
//	}
	
	
}
