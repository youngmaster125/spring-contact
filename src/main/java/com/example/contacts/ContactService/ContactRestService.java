

package com.example.contacts.ContactService;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.contacts.entities.Contact;

public interface ContactRestService {
	
	public List<Contact> getAllContact();
    public Contact getContact(Long id);
    public Contact enregistrer(Contact c);
    public void supprimer(Long idContact);
    public Page chercher(String mc,int page,int size);
}
