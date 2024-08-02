package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.bean.Student;
import com.example.demo.repo.StudentRepository;
@Component
public class TestStdRunner implements CommandLineRunner{
	@Autowired
	private StudentRepository repo;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(repo.getClass().getName());
		Student sob=new Student();
		sob.setStudentId(101);
		sob.setStudentName("ROhan");
		sob.setStudentFee(7800.0);
		
		repo.save(sob);
	}

}
