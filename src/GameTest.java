
public class GameTest {

	public static void main(String[] args) {
		
		Game game = new Cricket();
		System.out.println("Cricket:");
		game.play();;
		
		game = new Football();
		System.out.println("\nFootball:");
		game.play();

	}

}
