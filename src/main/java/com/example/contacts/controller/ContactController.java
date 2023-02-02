package com.example.contacts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.contacts.ContactService.ContactServiceImp;
import com.example.contacts.dao.ContactRepository;
import com.example.contacts.entities.Contact;

@RestController
@CrossOrigin("*")
public class ContactController {
   
	@Autowired
	ContactServiceImp contactServiceImp;
	@Autowired
	ContactRepository contactRepository;
	
	
	@RequestMapping(value="/contacts",method=RequestMethod.GET)
	public List<Contact> afficher(){
		
		return this.contactServiceImp.getAllContact();
	}
	
	@RequestMapping(value="/contacts/{id}",method=RequestMethod.GET)
	public Contact getContact(@PathVariable Long id){
		return this.contactServiceImp.getContact(id);
		
	}
	
	@RequestMapping(value="/chercherContacts",method=RequestMethod.GET)
	public Page<Contact> chercherContacts(
			@RequestParam(name="mc", defaultValue="") String mc,
			@RequestParam(name="page", defaultValue="0") int  page,
			@RequestParam(name="size", defaultValue="5") int size
			){
	
		 return this.contactServiceImp.chercher(mc, page, size);
		
	}

	
	@RequestMapping(value="/contacts",method=RequestMethod.POST)
	public Contact saveContact(@RequestBody Contact c){
		return this.contactServiceImp.enregistrer(c);
		
	}
	
	@RequestMapping(value="/contacts/{id}",method=RequestMethod.PUT)
	public Contact EditContact(@PathVariable Long id, @RequestBody Contact c){
		c.setId(id);
		return this.contactServiceImp.enregistrer(c);
		
	}

	
	@RequestMapping(value="/contacts/{id}",method=RequestMethod.DELETE)
	public Boolean deleteContact(@PathVariable Long id){
             this.contactServiceImp.supprimer(id);
             return true;
		
	}


}
