import java.util.Random;
import java.util.*;

public class SnakeLadder
{

	public static void main(String[] args) 
		{
			//UC_1
			RollDice();
			//UC_3
			option();
		
		}

	static int RollDice() 
		{
			Random rn = new Random();
			int dice = rn.nextInt(6) + 1;
			System.out.println("Roll_Dice: " + dice);
		}

	//UC_3

	public static void option()
		{
    			int position=0;
    			int luck=(int)(Math.floor(Math.random()*10)%3+1);
    			int dice=RollDice();
    			System.out.println("the dice is "+dice);
    	
			switch (luck) 
			{
    				case 1:System.out.println("The position is "+position);
    				break;

			    	case 2:	position+=dice;
    				System.out.println("Playing: "+position);
    				break;
    
				default:
    					System.out.println("player not playing!!!");
    				break;
    			}
    
		}

}
