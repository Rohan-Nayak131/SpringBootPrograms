package com.example.demo.dbcon;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties("my.db")
public class MyDBConnection {

	private String driver;
	private String url;
	private String username;
	private String pwd;
}
