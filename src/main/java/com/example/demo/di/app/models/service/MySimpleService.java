package com.example.demo.di.app.models.service;

import org.springframework.stereotype.Service;

@Service("mySimpleService")
public class MySimpleService implements IService {

	@Override
	public String operation() {
		return "ejecutando algun proceso simple...";
	}

}
