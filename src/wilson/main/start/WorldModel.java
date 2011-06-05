package wilson.main.start;

import java.util.ArrayList;

public class WorldModel implements WorldModelInterface {
	
	int size_x;
	int size_y;
	
	public WorldModel() {
		System.out.println("World Model: Created the world internally.");
		size_x = 20;
		size_y = 20;
	}

	public void ChangeRandomly() {
		System.out.println("WorldModel: World changed randomly internaly.");
		if (size_x < 30 ) size_x++;
		else size_x = 20;
		
		notifyWorldObservers();
	}
	
	public int GetWorldSizeX() {
		return size_x;
	}
	
	public int GetWorldSizeY() {
		return size_y;
	}
	
	ArrayList<WorldObserver> worldModelObservers = new ArrayList<WorldObserver>();
	
	public void registerObserver(WorldObserver worldObserver) {
		worldModelObservers.add(worldObserver);			
	}	
	
	public void unregisterObserver(WorldObserver worldObserver) {
		int i = worldModelObservers.indexOf(worldObserver);
		if (i >= 0) worldModelObservers.remove(i);
	}
	
	public void notifyWorldObservers() {
		for (int i = 0; i < worldModelObservers.size(); i++) {
			WorldObserver observer = (WorldObserver) worldModelObservers.get(i);
			observer.updateWorld();			
		}
	}	
	
	
}
