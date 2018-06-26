package com.tutosoftware.onlinebalance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class OnlineBalanceClientController {
	
	@RequestMapping(value = {"/"})
	public ModelAndView mostrarCliente() {
		
		return new ModelAndView("cliente");
	}

}
