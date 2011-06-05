package wilson.main.start;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WorldView implements WorldObserver, ActionListener {
		
	ControllerInterface controller;
	WorldModel worldModel;
	int sizeX;
	int sizeY;	
	
	JFrame viewFrame;
	MyTestPanel viewTest;
	JButton changeWorldRandomlyButton;	
		
	public WorldView(ControllerInterface controller, WorldModel worldModel ) {	
		System.out.println("WorldView: Show the World");
		this.controller = controller;
		this.worldModel = worldModel;		
		worldModel.registerObserver((WorldObserver)this);		
		sizeX = worldModel.GetWorldSizeX();
		sizeY = worldModel.GetWorldSizeY();		
	}

	public void createView() {
		// create all swing components here		
		viewFrame = new JFrame("Wilson WorldViewer V0.0001");
		viewFrame.getContentPane().setLayout(new GridLayout(1, 2, 5, 5));
		
		viewTest = new MyTestPanel();				
		viewFrame.getContentPane().add(viewTest);
		
		changeWorldRandomlyButton = new JButton("Change World");
		viewFrame.getContentPane().add(changeWorldRandomlyButton);
		
		changeWorldRandomlyButton.addActionListener(this);
		
		viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewFrame.setSize(800,600);
		viewFrame.setVisible(true);
	}
	
	public void updateWorld() {
		System.out.println("WorldView: UpdateWorld()");		
		sizeX = worldModel.GetWorldSizeX();
		sizeY = worldModel.GetWorldSizeY();
		viewTest.resizeMyTestPanel(sizeX, sizeY);
		viewFrame.repaint();
	}	
	
	public void actionPerformed(ActionEvent e) {		
		if (e.getSource() == changeWorldRandomlyButton) {
			System.out.println("World View: The " + e.getActionCommand() + " button is clicked.");
			controller.ChangeWorldRandomly();
		}

	}
}

