package com.nit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Entity
@Table(name="Jpa_Student_Info")
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Student
{
	@Id
	//@SequenceGenerator(name="SEQ_1",sequenceName = "SID_SEQ",initialValue = 500,allocationSize = 1)
	@GeneratedValue
	private Integer student_Id;
	@NonNull
	private Integer student_rollNumber;
	@NonNull
	@Column(length = 20)
	private String student_Name;
	@NonNull
	@Column(length = 40)
	private String student_address;
	@NonNull
	private Double student_Marks;
	
	

}
