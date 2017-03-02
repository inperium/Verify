package controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import view.VerifyFrame;

public class VerifyController {

	private VerifyFrame verifyFrame;

	public VerifyController() {
		verifyFrame = new VerifyFrame(this);
	}

	public void start() {

	}
	
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);
	
	public static final Pattern VALID_PHONE_NUMBER_REGEX = Pattern.compile("^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$",
			Pattern.CASE_INSENSITIVE);
	
	public static boolean validatePhone(String phoneStr) {
		Matcher matcher = VALID_PHONE_NUMBER_REGEX.matcher(phoneStr);
		return matcher.find();
	}

	public static boolean validateEmail(String emailStr) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
		return matcher.find();
	}
	
	public boolean validateFirstName(String name)
	{
		return name.matches( "[a-zA-Z]*" );
	}
	
	public boolean validateLastName(String name)
	{
		return name.matches( "[a-zA-z]+([ '-][a-zA-Z]+)*" );
	}
}