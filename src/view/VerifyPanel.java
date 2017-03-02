package view;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import controller.VerifyController;

public class VerifyPanel extends JPanel {
	private VerifyController baseController;

	private SpringLayout springLayout;

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
		this.springLayout = new SpringLayout();
		firstNameLabel = new JLabel("First Name");
		firstName = new JTextField();
		lastNameLabel = new JLabel("Last Name");
		lastName = new JTextField();
		phoneNumberLabel = new JLabel("Phone Number");
		phoneNumber = new JTextField();
		emailLabel = new JLabel("Email");
		email = new JTextField();
		submit = new JButton("Submit");

		setupPanel();
		setupLayout();
		setupListners();

	}

	private void setupPanel() {
		this.setLayout(springLayout);
		this.add(firstNameLabel);
		this.add(firstName);
		this.add(lastNameLabel);
		this.add(lastName);
		this.add(phoneNumberLabel);
		this.add(phoneNumber);
		this.add(emailLabel);
		this.add(email);
		this.add(submit);
	}

	private void setupListners() {
		this.submit.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if (baseController.firstName(firstName.getText())) {
					firstName.setBackground(new Color(47, 204, 47));
				} else {
					firstName.setBackground(new Color(219, 15, 15));
				}
				if (baseController.lastName(lastName.getText())) {
					lastName.setBackground(new Color(47, 204, 47));
				} else {
					lastName.setBackground(new Color(219, 15, 15));
				}
				if (baseController.validatePhone(phoneNumber.getText())) {
					phoneNumber.setBackground(new Color(47, 204, 47));
				} else {
					phoneNumber.setBackground(new Color(219, 15, 15));
				}
				if (baseController.validateEmail(email.getText())) {
					email.setBackground(new Color(47, 204, 47));
				} else {
					email.setBackground(new Color(219, 15, 15));
				}
			}

		});
	}

	private void setupLayout() {
		springLayout.putConstraint(SpringLayout.NORTH, firstNameLabel, 49, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, firstNameLabel, 47, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.NORTH, firstName, 44, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, firstName, -71, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.NORTH, lastNameLabel, 16, SpringLayout.SOUTH, firstNameLabel);
		springLayout.putConstraint(SpringLayout.WEST, lastNameLabel, 0, SpringLayout.WEST, firstNameLabel);
		springLayout.putConstraint(SpringLayout.NORTH, lastName, 6, SpringLayout.SOUTH, firstName);
		springLayout.putConstraint(SpringLayout.WEST, firstName, 0, SpringLayout.WEST, lastName);
		springLayout.putConstraint(SpringLayout.EAST, lastName, -71, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.NORTH, phoneNumberLabel, 16, SpringLayout.SOUTH, lastNameLabel);
		springLayout.putConstraint(SpringLayout.EAST, phoneNumberLabel, 0, SpringLayout.EAST, firstNameLabel);
		springLayout.putConstraint(SpringLayout.NORTH, phoneNumber, 6, SpringLayout.SOUTH, lastName);
		springLayout.putConstraint(SpringLayout.WEST, lastName, 0, SpringLayout.WEST, phoneNumber);
		springLayout.putConstraint(SpringLayout.EAST, phoneNumber, -71, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.NORTH, emailLabel, 16, SpringLayout.SOUTH, phoneNumberLabel);
		springLayout.putConstraint(SpringLayout.EAST, emailLabel, 0, SpringLayout.EAST, firstNameLabel);
		springLayout.putConstraint(SpringLayout.NORTH, email, 6, SpringLayout.SOUTH, phoneNumber);
		springLayout.putConstraint(SpringLayout.WEST, email, 39, SpringLayout.EAST, emailLabel);
		springLayout.putConstraint(SpringLayout.EAST, email, -71, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.WEST, phoneNumber, 0, SpringLayout.WEST, email);
		springLayout.putConstraint(SpringLayout.NORTH, submit, 44, SpringLayout.SOUTH, email);
		springLayout.putConstraint(SpringLayout.WEST, submit, 175, SpringLayout.WEST, this);
	}

}
