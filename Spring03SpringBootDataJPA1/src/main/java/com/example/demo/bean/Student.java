package com.example.demo.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
/*
 * When you annotate a class with @Entity, you're declaring that this class is a JPA entity. 
 * This tells Spring (and JPA) that the class should be managed as a persistent entity and 
 * should be mapped to a database table
 */
@Table(name="STUDENT_INFO")
/*
 * The @Table annotation is used to specify the exact table name and
 *  additional table-related metadata (such as schema or catalog) to which the entity should be mapped.
 *   It allows you to customize how the entity maps to the database.
 */
public class Student {
	
	@Id
	@Column(name="STDUENT_ID")
	/*
	 * Here bean class property will be mapped to mentioned table column
	 * If  a bean class has id ,then it will be treated as primary key
	 */
	private Integer studentId;
	@Column(name="STUDENT_NAME")
	private String studentName;
	@Column(name="STUDENT_FEE")
	private Double studentFee;
}
