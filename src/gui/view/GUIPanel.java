package gui.view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import gui.controller.GUIController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;


/**
 * 
 * @author jray1621
 * @version 1.2
 */

public class GUIPanel extends JPanel
{
	
	private GUIController baseController;
	private SpringLayout baseLayout;
	private JButton firstButton;
	private JButton secondButton;
	
	public GUIPanel(GUIController baseController)
	{
		//if you don't use new you have the same item and can pass information.
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		firstButton = new JButton("m first button.");
		
	
		secondButton = new JButton("wow I did it again");
	
		secondButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		
		setupPanel();
		setupLayout();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(secondButton);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, secondButton, 74, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, secondButton, 30, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -60, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, -174, SpringLayout.EAST, this);
	}
	
	
}
