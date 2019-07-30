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

public class StudentTestImplement extends ApplicationTests{


	@Autowired
	private WebApplicationContext webApplicationContext;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
    
	
	
	 @Test
		public void testStudent() throws Exception {
			mockMvc.perform(get("/get/1")).andExpect(status().isOk())
					.andExpect(content().contentType("application/json;charset=UTF-8"))
				    .andExpect(jsonPath("$.idStudent").value(1))
				    .andExpect(jsonPath("$.firstName").value("Marcelo"))
					.andExpect(jsonPath("$.lastName").value("Ampudia"))
	     			.andExpect(jsonPath("$.gender").value("masculino"))
					.andExpect(jsonPath("$.nivel").value("primario"))
	     			.andExpect(jsonPath("$.grade").value("6to"))
	     			.andExpect(jsonPath("$.lessonNameSt").value("Matematica")); 

		}
	    
	 @Test
		public void findAll() throws Exception {
			mockMvc.perform(get("/api/service-student")).andExpect(status().isOk());
	 }
}
