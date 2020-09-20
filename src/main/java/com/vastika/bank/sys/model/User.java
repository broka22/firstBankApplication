package com.vastika.bank.sys.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tbl_user")
@Data
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "user_name")
	private String userName;

	private String password;
	private String email;

	@Column(name = "mobile_no")
	private long mobileNo;
	private int ssn;

	@OneToOne(cascade = CascadeType.ALL)
	private AccountInfo accountInfo;

}
