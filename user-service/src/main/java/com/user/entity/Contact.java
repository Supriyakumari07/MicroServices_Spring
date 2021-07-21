package com.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data 
public class Contact {

	private Long cId;
	private String email;
	private String contactName;
	private Long userId;
	
	
}
