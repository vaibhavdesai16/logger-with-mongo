package com.learning.loggerexample;

import com.learning.loggerexample.entities.GroceryItem;
import com.learning.loggerexample.services.ItemService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LoggerExampleApplicationTests {

	@Autowired
	ItemService itemService;
	@Test
	void contextLoads() {

	}

	@Test
	void testInsert(){
		itemService.addItem(new GroceryItem("Whole Wheat Biscuit", "Whole Wheat Biscuit", 5, "snacks"));
	}

}
