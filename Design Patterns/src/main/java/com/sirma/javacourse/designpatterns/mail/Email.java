package com.sirma.javacourse.designpatterns.mail;

import java.util.List;

/**
 * Class that create all atributes for Email.
 * 
 * @author Malvina Makarieva
 */
public class Email {
	private String from;
	private String to;
	private String subject;
	private String content;
	private String carbonCopy;
	private List<String> attachments;

	/**
	 * Default constructor.
	 * 
	 * @param from
	 *            sender of the email.
	 */
	public Email(String from) {
		this.from = from;

	}

	/**
	 * Second connstructor.
	 * 
	 * @param from
	 *            sender of the email.
	 * @param to
	 *            receiver of email.
	 * @param subject
	 *            of email.
	 * @param content
	 *            text ot email.
	 * @param cC
	 *            Carbon copy of email.
	 * @param attachments
	 *            attached file name.
	 */
	public Email(String from, String to, String subject, String content, String cC,
			String attachments) {
		this.from = from;
		this.to = null;
		this.subject = null;
		this.content = null;
		this.carbonCopy = null;
		this.attachments = null;

	}

	/**
	 * Getter method for from.
	 *
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * Setter method for from.
	 *
	 * @param from
	 *            the from to set
	 */
	public Email setFrom(String from) {
		this.from = from;
		return this;
	}

	/**
	 * Getter method for to.
	 *
	 * @return the to
	 */
	public String getTo() {
		return to;
	}

	/**
	 * Setter method for to.
	 *
	 * @param to
	 *            the to to set
	 */
	public Email setTo(String to) {
		this.to = to;
		return this;
	}

	/**
	 * Getter method for subject.
	 *
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * Setter method for subject.
	 *
	 * @param subject
	 *            the subject to set
	 */
	public Email setSubject(String subject) {
		this.subject = subject;
		return this;
	}

	/**
	 * Getter method for content.
	 *
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * Setter method for content.
	 *
	 * @param content
	 *            the content to set
	 */
	public Email setContent(String content) {
		this.content = content;
		return this;
	}

	/**
	 * Getter method for carbonCopy.
	 *
	 * @return the ccarbonCopy
	 */
	public String getCarbonCopy() {
		return carbonCopy;
	}

	/**
	 * Setter method for carbonCopy.
	 *
	 * @param carbonCopy
	 *            the carbonCopy to set
	 */
	public Email setCarbonCopy(String carbonCopy) {
		this.carbonCopy = carbonCopy;
		return this;
	}

	/**
	 * Getter method for attachments.
	 *
	 * @return the attachments
	 */
	public List<String> getAttachments() {
		return attachments;
	}

	/**
	 * Setter method for attachments.
	 *
	 * @param attachments
	 *            the attachments to set
	 */
	public Email setAttachments(List<String> attachments) {
		this.attachments = attachments;
		return this;
	}

	/**
	 * Method to display Email object to String. {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "Email atributs are:" + System.lineSeparator() + "From: " + getFrom()
				+ System.lineSeparator() + "To: " + getTo() + System.lineSeparator() + "Subject: "
				+ getSubject() + System.lineSeparator() + "Content: " + getContent()
				+ System.lineSeparator() + "Carbon copy: " + getCarbonCopy()
				+ System.lineSeparator() + "Attaches: " + getAttachments();
	}

}
