package com.bootcamp.test.implement;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.bootcamp.ApplicationTests;

public class SubjectTestImplement extends ApplicationTests{

	@Autowired
	private WebApplicationContext webApplicationContext;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
    
	 @Test
		public void testSubject() throws Exception {
			mockMvc.perform(get("/subject/2")).andExpect(status().isOk())
					.andExpect(content().contentType("application/json;charset=UTF-8"))
				    .andExpect(jsonPath("$.idSubject").value(2))
				    .andExpect(jsonPath("$.subjectName").value("lenguaje")); 

		}
	    
	 @Test
		public void findAll() throws Exception {
			mockMvc.perform(get("/subject")).andExpect(status().isOk());
	 }
	
	
}
