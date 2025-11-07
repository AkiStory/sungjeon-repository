package com.kt.domain.order;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class Receiver {
	@Column(name = "receiver_name")
	private String name; 	   // receiver_name
	@Column(name = "receiver_address")
	private String address;	 // receiver_address
	@Column(name = "receiver_mobile")
	private String mobile;	 // receiver_mobile
}
