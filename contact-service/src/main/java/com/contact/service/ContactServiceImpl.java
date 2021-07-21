package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	// dummy Contact data
	List<Contact> list = List.of(
		new Contact(1L,"sup@email.com","Supriya Kumari",1111L),
		new Contact(2L,"supriya@email.com","Sushant",1171L),
		new Contact(3L,"selmon.bhai@email.com","Selmon Bhai",1171L)
			); 
	
	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		return list.stream().filter(contact-> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
