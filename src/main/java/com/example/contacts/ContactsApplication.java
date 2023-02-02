package com.example.contacts;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.contacts.dao.ContactRepository;
import com.example.contacts.entities.Contact;

@SpringBootApplication
public class ContactsApplication /*implements CommandLineRunner*/  {
	@Autowired
	 private ContactRepository contactRepository;
	public static void main(String[] args) {
		SpringApplication.run(ContactsApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		contactRepository.save(new Contact("Paul","Manley",df.parse("15/03/1999"),"manley@gmail,com",
				"49189875","manley.jpg"));
		contactRepository.save(new Contact("Jean","Wilbert",df.parse("25/09/1979"),"jean@gmail,com",
				"49189875","wilbert.jpg"));

		contactRepository.save(new Contact("Leon","Charles",df.parse("22/06/2005"),"leon@gmail,com",
				"49189875","leon.jpg"));
		contactRepository.findAll().forEach(c->{
			System.out.println(c.getNom());
		});
	
	}
*/
}
