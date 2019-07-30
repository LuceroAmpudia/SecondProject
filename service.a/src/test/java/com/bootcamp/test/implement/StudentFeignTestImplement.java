package com.bootcamp.test.implement;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.bootcamp.ApplicationTests;

public class StudentFeignTestImplement extends ApplicationTests{

	@Autowired
	private WebApplicationContext webApplicationContext;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
    
	 @Test
		public void testStudentFeign() throws Exception {
			mockMvc.perform(get("/studentFeign/1")).andExpect(status().isOk());

		}
	    
	 @Test
		public void findAll() throws Exception {
			mockMvc.perform(get("/studentFeign")).andExpect(status().isOk());
	 }
	
	
}
