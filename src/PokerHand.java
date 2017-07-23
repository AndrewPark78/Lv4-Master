import java.util.ArrayList;

/**********************************
 * Texas Hold-em! Your task is to determine if the cards in the list makes up a straight (five cards of sequential rank)
 * or not. The cards will always have values ranging from 2-14, where 14 is the ace.
 * 
 * Be aware that the ace (14) also should count as value 1!
 * 
 * The number of cards will vary, but will never be more than 7 (the board (5) + player hand (2))
 * 
 * Examples:
 * 
 * straight: 9-10-11-12-13
 * 
 * straight: 14-2-3-4-5
 * 
 * straight: 2-7-8-5-10-9-11
 * 
 * not straight: 7-8-12-13-14
 *
 ***********************/
public final class PokerHand {
	public static boolean IsStraight(ArrayList<Integer> cards) {
		ArrayList<Integer> LowToHigh = new ArrayList<Integer>();
		Integer lowest = cards.get(0);
		int j = 0;
		for (int i = 0; i < cards.size(); i++) {
			for (int k = 0; k < cards.size(); k++) {
				if (cards.get(k) < lowest) {
					lowest = cards.get(k);
					j = k;
				}
			}
			cards.set(j, 15);
			LowToHigh.add(lowest);
			lowest = 15;
		}
		System.out.println(LowToHigh);
		int p = LowToHigh.get(0);
		if (LowToHigh.size() < 5) {
			return false;
		}
		for (int i = 1; i < LowToHigh.size(); i++) {
			if (LowToHigh.get(i) != p + 1) {
				if (LowToHigh.get(i) != 14) {
					return false;
				}
			}
			p++;
		}
		return true;
	}
}