package com.investorinc.springboot.springboot.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.investorinc.springboot.springboot.controller.InvestorController;
import com.investorinc.springboot.springboot.service.InvestorService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = InvestorController.class, secure = false)
public class InvestorControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private InvestorService investorService;
	
	@Test
	public void fetchAllInvestors() throws Exception{
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				"/investors").accept(
				MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		MockHttpServletResponse response = result.getResponse();
		System.out.println("here "+response);
		
	}
}
