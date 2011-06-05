package wilson.main.start;

public interface WorldModelInterface {
	
	int GetWorldSizeX();
	int GetWorldSizeY();
	
	void registerObserver(WorldObserver worldObserver);
	void unregisterObserver(WorldObserver worldObserver);
	
}
