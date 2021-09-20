import java.util.Random;
import java.util.*;

public class SnakeLadder {

	public static void main(String[] args) {
		
		// UC1_SinglePlayer
		int position = 0;
		
		// UC2_Roll_Dice using Random
		RollDice();
	}

	static void RollDice() {
		Random rn = new Random();
		int dice = rn.nextInt(6) + 1;
		System.out.println("Roll_Dice: " + dice);
	}
}
