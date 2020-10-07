package com.vastika.bank.sys.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tbl_role")
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "role_name")
    private String roleName;
}
