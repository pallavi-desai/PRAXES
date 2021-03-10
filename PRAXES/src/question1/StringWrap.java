package question1;

import java.util.ArrayList;

public class StringWrap {

	public ArrayList<String> performWrap(String s, int k) {
		
		if(s.length()<k) {
			return null;
		}
		
		ArrayList<String> result = new ArrayList<String>();
		String[] sub = s.split(" ");
		int length = 0;
		ArrayList<String> wrap = new ArrayList<String>();

		for (int i = 0; i < sub.length; i++) {
			
			length += sub[i].length();
			if (length > k) {
				result.add(String.join(" ", wrap));
				length = sub[i].length();
				wrap.clear();
			}
			wrap.add(sub[i]);
			length++;
		}
		result.add(String.join(" ", wrap));
		return result;
	}
}
