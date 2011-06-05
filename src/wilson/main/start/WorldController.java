package wilson.main.start;

public class WorldController implements ControllerInterface  {
	
	WorldModel worldModel;
	WorldView worldView;	
	
	public WorldController(WorldModel worldModel) {
		this.worldModel = worldModel;		
		this.worldView = new WorldView(this, worldModel);
		worldView.createView();		
	}
	
	public void ChangeWorldRandomly() {
		System.out.println("WorldController: Got Info from View Button ChangeWorld was clicked");
		worldModel.ChangeRandomly();
	}
}
