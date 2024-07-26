package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.dbcon.MyDBConnection;
@Component
public class TestRunner implements CommandLineRunner{
	@Autowired
	MyDBConnection myCon;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("The Connection is "+myCon);
	}
}
