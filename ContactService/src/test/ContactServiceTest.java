package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contact.Contact;
import contact.ContactService;

public class ContactServiceTest {

	@Test
	public void testAddContactSuccessfully() {
		ContactService contactService = new ContactService();
		Contact testContact = new Contact("3", "Jane", "Doe", "5551234", "PO Box 555 Wellpinit, WA, 99040");
		
		assertTrue(contactService.addContact(testContact));
	}

	@Test
	public void testDeleteContact() {
		ContactService contactService = new ContactService();
		
		Contact test1 = new Contact("3", "Jane", "Doe", "5551234", "PO Box 555 Wellpinit, WA, 99040");
		Contact test2 = new Contact("7", "Jim", "Smith", "12345678", "Sample1234");
		
		contactService.addContact(test1);
		contactService.addContact(test2);
		
		assertTrue(contactService.deleteContact("7"));
		assertFalse(contactService.deleteContact("31"));
		assertFalse(contactService.deleteContact("7"));
	}
		
		
	@Test
	public void testUpdateContact() {
		ContactService contactService = new ContactService();
		
		Contact test1 = new Contact("3", "Jane", "Doe", "5551234", "PO Box 555 Wellpinit, WA, 99040");
		Contact test2 = new Contact("7", "Jim", "Smith", "12345678", "Sample1234");

		assertFalse(contactService.updateContact("3", "Jane", "Doe", "5551234", "New Address PO Box 554 Wellpinit, WA, 99040"));
		
		contactService.addContact(test1);
		contactService.addContact(test2);
		
		assertTrue(contactService.updateContact("7", "Jane", "Doe", "5551234", "New Address PO Box 554 Wellpinit, WA, 99040"));
		assertFalse(contactService.updateContact("71", "Jim", "Smith", "12345678", "Sample1234"));
		
	}
}
