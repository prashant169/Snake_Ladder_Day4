import java.util.Random;

public class SnakeLadder{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		option();
	}

	public static void option() {
		int position = 0;
		while (position <= 100) {
			int luck = (int) (Math.floor(Math.random() * 10) % 3 + 1);
			int dice = rolls_dice();
			System.out.println("the dice is " + dice);
			System.out.println("the luck is " + luck);
			switch (luck) {
			case 1:
				System.out.println("The position is " + position);
				break;
			case 2:
				position += dice;
				System.out.println("Playing: " + position);
				break;
			default:
				System.out.println("player not playing!!!");
				break;
			}
		}
	}

	public static int rolls_dice() {
		int dice = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		return dice;
	}
}
