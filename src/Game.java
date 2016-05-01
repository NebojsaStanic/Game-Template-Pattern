
public abstract class Game {
	
	public final void play(){
		initalize();
		start();
		stop();
	}
	
	public abstract void initalize();
	
	public abstract void start();
	
	public abstract void stop();
}
