package gui.view;

import gui.controller.GUIController;

import javax.swing.JFrame;

/**
 * Framework for a GUI Frame class.
 * @author jray1621
 *@version 1.3 10/22/13
 */
public class GUIFrame extends JFrame
{
	/**
	 * The controller object that will be shared across the application.
	 */
	private GUIController baseController;
	
	
	private GUIPanel basePanel;
	
	public GUIFrame(GUIController baseController)
	{
		this.baseController = baseController;
		basePanel = new GUIPanel(baseController);
		
		setupFrame();
	}
	/**
	 * Helper method to setup the default sixe and panel for the frame.
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400, 300);
		this.setVisible(true);
	}
}
