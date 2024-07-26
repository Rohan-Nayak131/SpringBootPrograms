package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.dbcon.MyDBConnection;

@Component
public class TestRunner implements CommandLineRunner {
	
	@Autowired
	private MyDBConnection connection;
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("DB connection is "+connection);
		
	}

}
