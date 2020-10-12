package com.example.demo.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service("myComplexService")
public class MyComplexService implements IService {

	@Override
	public String operation() {
		return "ejecutando algun proceso complejo...";
	}

}
