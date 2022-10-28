package abstractClasses;

public abstract class GameCalculater {
	public abstract void calculate(); 
		
	public final void gameOver() {
		System.out.println("Game Over");
	}

}
