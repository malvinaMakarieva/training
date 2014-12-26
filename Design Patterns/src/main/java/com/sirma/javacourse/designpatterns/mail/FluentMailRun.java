package com.sirma.javacourse.designpatterns.mail;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that run Email class.
 * 
 * @author Malvina Makarieva
 */
public class FluentMailRun {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> attachments = new ArrayList<String>(2);
		attachments.add("Attachment 1");
		attachments.add("Attachment 2");

		Email newEmail = new Email("bumba@abv.bg").setTo("ivan@gmail.bg").setSubject("secret")
				.setContent("i will tell you my secret!").setAttachments(attachments);

		System.out.println(newEmail.toString());

	}
}
