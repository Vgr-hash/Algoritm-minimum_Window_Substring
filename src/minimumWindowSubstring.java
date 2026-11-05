
public class minimumWindowSubstring {
	public static void main(String[] args) {
		
		String s = "ADOBECODEBANC";
		String t = "ABC";
		
		String empty = "";
		
		for(int index = 0;s.length() > index;index++) {
			for(int index1 = index + 1;s.length() > index1;index1++) {
				String word = s.substring(index,index1 + 1);
				// System.out.println(word);
				
				if(word.contains("A") && word.contains("B") && word.contains("C")) {
					if(empty.isEmpty() || word.length() < empty.length()) {
						empty = word;
						System.out.println(empty);
					}
				}
			}
		}
		
		System.out.println("s stringindəki t stringindəki bütün simvolları saxlayan ən qısa alt string --- >  " + empty);
		System.out.println("uzunluğu  --- > " + empty.length());
	}
}
