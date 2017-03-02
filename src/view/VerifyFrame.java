package view;

import javax.swing.JFrame;

import controller.VerifyController;

public class VerifyFrame extends JFrame
{
	private VerifyController baseController;
	private VerifyPanel verifyPanel;

	public VerifyFrame(VerifyController verifyController) 
	{
			super();
			this.baseController = verifyController;
			this.verifyPanel = new VerifyPanel(baseController);
			
			this.setupFrame();
	}

	private void setupFrame() 
	{
		this.setContentPane(verifyPanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Verify");
		this.setSize(650, 400);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public VerifyController getBaseController() {
		return baseController;
	}

	public void setBaseController(VerifyController baseController) {
		this.baseController = baseController;
	}

	public VerifyPanel getVerifyPanel()
	{
		return this.verifyPanel;
	}

}