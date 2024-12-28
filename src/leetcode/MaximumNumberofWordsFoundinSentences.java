package leetcode;

public class MaximumNumberofWordsFoundinSentences {

	public static void main(String[] args) {
	String[] se = {"alice and bob love leetcode", "i think so too", "this is great thanks very much gurleen singh malhotra"};
	MaximumNumberofWordsFoundinSentences o = new MaximumNumberofWordsFoundinSentences();
	
	System.out.println(o.mostWordsFound(se));
	}

	public int mostWordsFound(String[] sentences) {
		int c = 0;
		for (String s : sentences) {
			int l = s.split(" ").length;
			if (c < l)
				c = l;
			// c = c + sentences;
		}
		return c;
	}

}
