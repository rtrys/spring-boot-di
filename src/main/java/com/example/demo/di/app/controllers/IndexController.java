package com.example.demo.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.di.app.models.service.IService;

@Controller
public class IndexController {

	@Autowired
	@Qualifier("mySimpleService")
	private IService servicio;

//	@Autowired
//	private IService servicio;

//	public IndexController() {
//	}

//	@Autowired
//	public IndexController(IService servicio) {
//		super();
//		this.servicio = servicio;
//	}

//	@Autowired
//	public IService getServicio() {
//		return servicio;
//	}

	@GetMapping({ "", "/", "/index" })
	public String index(Model model) {
		
		model.addAttribute("object", servicio.operation());
		
		return "index";
	}
}
