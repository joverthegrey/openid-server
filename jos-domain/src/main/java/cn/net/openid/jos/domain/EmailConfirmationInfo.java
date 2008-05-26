/**
 * Created on 2008-3-10 下午09:39:35
 */
package cn.net.openid.jos.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Sutra Zhou
 * 
 */
public class EmailConfirmationInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1421672591504003924L;

	private Email email;
	private String confirmationCode;
	private boolean sent;
	private Date sentDate;
	private boolean confirmed;
	private Date confirmedDate;

	/**
	 * 
	 */
	public EmailConfirmationInfo() {
		super();
		this.email = new Email();
	}

	/**
	 * @param email
	 */
	public EmailConfirmationInfo(Email email) {
		super();
		this.email = email;
	}

	/**
	 * @param email
	 * @param confirmationCode
	 */
	public EmailConfirmationInfo(Email email, String confirmationCode) {
		super();
		this.email = email;
		this.confirmationCode = confirmationCode;
	}

	/**
	 * @return the email
	 */
	public Email getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(Email email) {
		this.email = email;
	}

	/**
	 * @return the confirmationCode
	 */
	public String getConfirmationCode() {
		return confirmationCode;
	}

	/**
	 * @param confirmationCode
	 *            the confirmationCode to set
	 */
	public void setConfirmationCode(String confirmationCode) {
		this.confirmationCode = confirmationCode;
	}

	/**
	 * @return the sent
	 */
	public boolean isSent() {
		return sent;
	}

	/**
	 * @param sent
	 *            the sent to set
	 */
	public void setSent(boolean sent) {
		this.sent = sent;
	}

	/**
	 * @return the sentDate
	 */
	public Date getSentDate() {
		return sentDate;
	}

	/**
	 * @param sentDate
	 *            the sentDate to set
	 */
	public void setSentDate(Date sentDate) {
		this.sentDate = sentDate;
	}

	/**
	 * @return the confirmed
	 */
	public boolean isConfirmed() {
		return confirmed;
	}

	/**
	 * @return the confirmedDate
	 */
	public Date getConfirmedDate() {
		return confirmedDate;
	}

	/**
	 * @param confirmedDate
	 *            the confirmedDate to set
	 */
	public void setConfirmedDate(Date confirmedDate) {
		this.confirmedDate = confirmedDate;
	}

	/**
	 * @param confirmed
	 *            the confirmed to set
	 */
	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}

}