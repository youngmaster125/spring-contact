package com.example.contacts.ContactService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.contacts.dao.ContactRepository;
import com.example.contacts.entities.Contact;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ContactServiceImp implements ContactRestService {
   
	@Autowired
	ContactRepository contactRepository;
	@Override
	public List<Contact> getAllContact() {
		// TODO Auto-generated method stub
		return this.contactRepository.findAll();
	}
	@Override
	public Contact getContact(Long id) {
		// TODO Auto-generated method stub
		 return  this.contactRepository.findById(id).orElse(new Contact());
		 	}
	
	@Override
	public Contact enregistrer(Contact c) {
		// TODO Auto-generated method stub
		 //System.out.println("date: "+c.getDateNaisssance().getDayOfYear());
		return this.contactRepository.save(c);
	}
	
	@Override
	public void supprimer(Long idContact) {
		this.contactRepository.deleteById(idContact);
		
	}
	@Override
	public Page chercher(String mc, int page,int size) {
		// TODO Auto-generated method stub
		Pageable c= PageRequest.of(page, size);
		return this.contactRepository.chercher("%"+mc+"%", c);
	} 

}
