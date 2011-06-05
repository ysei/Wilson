package wilson.main.start;

public class AcceptanceTest_MVC {
	public static void main(String[] args) {
		
		WorldModel worldModel = new WorldModel();
		ControllerInterface controller = new WorldController(worldModel);
				
		for (;;) {
			// controller.ChangeWorldRandomly();
			try {
				Thread.sleep(1);
			}
			catch (InterruptedException ex) {
				
			}
		}
		
	}	
}
