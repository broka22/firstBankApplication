package com.vastika.bank.sys.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="tbl_account")
@Data
public class AccountInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="deposit_amount")
	private int depositAmount;
	
	@Column(name="withdraw_amount")
	private int withdrawAmount;
	
	@Column(name="current_balance")
	private int currentBalance;

}
