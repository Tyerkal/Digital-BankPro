package com.bank.bankapp.model;

import java.math.BigDecimal;


import lombok.Data;

@Data
@javax.persistence.Entity
public class Account {
	
	@javax.persistence.Id
	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	private Long id;

    private String accountNumber;
    private BigDecimal balance;

    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(name = "user_id")
    private User user;

}
