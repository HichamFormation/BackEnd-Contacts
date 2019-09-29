package org.sid;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.sid.dao.ContactRepository;
import org.sid.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionContactsApplication implements CommandLineRunner{

	
	@Autowired
	private ContactRepository contactRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(GestionContactsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		
		
		
//		contactRepository.save(new Contact("aaaa", "aaaaa", df.parse("11/11/1111"), "aaaaa@aaa.com", 11111, "aaaaa"));
//		contactRepository.save(new Contact("bbbb", "bbbbb", df.parse("22/22/2222"), "bbbbb@bbb.com", 11111, "bbbbb"));
//		contactRepository.save(new Contact("cccc", "ccccc", df.parse("33/33/3333"), "ccccc@ccc.com", 11111, "ccccc"));
		
		  
		
		contactRepository.findAll().forEach(c->{
			System.out.println(c.getNom());
		});
	}

}
