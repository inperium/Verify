package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.VerifyController;

public class VerifyPanel {
	private VerifyController baseController;
	private JLabel firstNameLabel;
	private JTextField firstName;
	private JLabel lastNameLabel;
	private JTextField lastName;
	private JLabel phoneNumberLabel;
	private JTextField phoneNumber;
	private JLabel emailLabel;
	private JTextField email;
	private JButton submit;
	
	public VerifyPanel(VerifyController baseController) {
		super();
		this.baseController = baseController;

		setupPanel();
		setupLayout();
		setupListners();

	}

	private void setupListners() {
		// TODO Auto-generated method stub
		
	}

	private void setupLayout() {
		// TODO Auto-generated method stub
		
	}

	private void setupPanel() {
		// TODO Auto-generated method stub
		
	}

}
