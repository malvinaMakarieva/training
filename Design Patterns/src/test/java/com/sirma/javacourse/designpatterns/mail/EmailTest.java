package com.sirma.javacourse.designpatterns.mail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * Class test Email class.
 * 
 * @author Malvina Makarieva
 */
public class EmailTest {
	/**
	 * Test Fluent interface for Email class.
	 */
	@Test
	public void chekFlurntEmail() {
		List<String> attachments = new ArrayList<String>(2);
		attachments.add("Attachment 1");
		attachments.add("Attachment 2");

		List<String> expectedAttachments = new ArrayList<String>(2);
		expectedAttachments.add("Attachment 1");
		expectedAttachments.add("Attachment 2");

		Email newEmail = new Email("bumba@abv.bg").setTo("ivan@gmail.bg").setSubject("secret")
				.setContent("i will tell you my secret!").setAttachments(attachments);
		Assert.assertEquals("bumba@abv.bg", newEmail.getFrom());
		Assert.assertEquals("ivan@gmail.bg", newEmail.getTo());
		Assert.assertEquals("secret", newEmail.getSubject());
		Assert.assertEquals("i will tell you my secret!", newEmail.getContent());
		Assert.assertEquals(null, newEmail.getCarbonCopy());
		Assert.assertEquals(expectedAttachments, newEmail.getAttachments());

	}
}
