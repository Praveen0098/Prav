package exc;

import java.util.HashMap;

public class Hasmap {
	public static void main(String[] args) {
		HashMap <Integer ,String> as = new HashMap<Integer, String>();
		as.put(1,"vikki");
		as.put(2, "praveen");
		as.put(3, "ram");
		for (String st : as.values()) {
			System.out.println(st);
			
		}
	}

}
