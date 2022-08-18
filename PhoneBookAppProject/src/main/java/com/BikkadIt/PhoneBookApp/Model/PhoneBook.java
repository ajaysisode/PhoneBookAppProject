package com.BikkadIt.PhoneBookApp.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Entity
@Getter
@NoArgsConstructor
public class PhoneBook {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	@Column(length = 100)
	private String pname;
	private String pemail;
	private Integer phNumber;
	
	
}
