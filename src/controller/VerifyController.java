package controller;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import view.VerifyFrame;

public class VerifyController {
	
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
	private VerifyFrame verifyFrame;

	public VerifyController() {
		verifyFrame = new VerifyFrame(this);
	}

	public void start() {

	}
	
	public boolean validateEmail(String emailStr) {
		        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
		        return matcher.find();
		}
}