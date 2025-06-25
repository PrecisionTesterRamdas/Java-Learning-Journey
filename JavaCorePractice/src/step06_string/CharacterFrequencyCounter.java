package step06_string;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyCounter {

	public static void main(String[] args) {

		String inputData = "Automation Automation     ";
		CharacterFrequencyCounter.charFreqCounter(inputData);

	}

	private static void charFreqCounter(String inputData) {
		String inputDataLower = inputData.toLowerCase();
		HashMap<Character, Integer> hm = new HashMap<>();

		for (int i = 0; i < inputDataLower.length(); i++) {
			char ch = inputDataLower.charAt(i);
			if (ch != ' ') {
				if (hm.containsKey(ch)) {
					hm.put(ch, hm.get(ch) + 1);
				} else {
					hm.put(ch, 1);
				}
			}
		}
		for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
	}
}