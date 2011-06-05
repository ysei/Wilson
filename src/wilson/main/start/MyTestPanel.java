package wilson.main.start;

import java.awt.Graphics;

import javax.swing.JPanel;

public class MyTestPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	int sizeX;
	int sizeY;	
	 
	public MyTestPanel() {		
	}
	
	public void resizeMyTestPanel(int sizeX, int sizeY) {
		this.sizeX = sizeX;
		this.sizeY = sizeY;
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);				
		g.drawRect(20, 20, sizeX, sizeY );					
	}	
}
