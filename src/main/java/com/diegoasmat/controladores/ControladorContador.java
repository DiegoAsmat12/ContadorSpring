package com.diegoasmat.controladores;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControladorContador {

	@RequestMapping(value="/",method = RequestMethod.GET)
	public String renderIndex(HttpSession session) {
		if(session.getAttribute("counter")!=null) {
			int counter = (int) session.getAttribute("counter");
			
			session.setAttribute("counter", ++counter);
			
		}
		else {
			session.setAttribute("counter", 1);
		}
		return "index.jsp";
	}
	
	@RequestMapping(value="/contador",method = RequestMethod.GET)
	public String renderCounter(HttpSession session) {
		return "contador.jsp";
	}
}
