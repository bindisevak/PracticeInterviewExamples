package graphs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

class WordNode {
	String word;
	int numSteps;
	
	public WordNode(String word, int numSteps){
		this.word = word;
		this.numSteps = numSteps;
	}
}
public class WordLadder {
	public static void main(String[] args) {
		String begin = "hit";
		String end = "cog";
		Set<String> dict = new HashSet<String>();
		dict.add("hot");
		dict.add("dot");
		dict.add("dog");
		dict.add("lot");
		dict.add("log");
		
		WordLadder wl = new WordLadder();
		System.out.println("Result length: "+wl.getLadderLength(begin, end, dict));
	}
	
	public int getLadderLength(String begin, String end, Set<String> dict){
		LinkedList<WordNode> queue = new LinkedList<WordNode>();
		queue.add(new WordNode(begin, 1));
		
		dict.add(end);
		
		while(!queue.isEmpty()){
			WordNode top = queue.remove();
			String word = top.word;
			
			if(word.equals(end))
				return top.numSteps;
			
			char[] arr = word.toCharArray();
			for(int i=0; i<arr.length; i++){
				for(char c='a'; c<='z'; c++){
					char temp = arr[i];
					if(arr[i] != c)
						arr[i]=c;
					
					String newWord = new String(arr);
					//System.out.println(newWord);
					if(dict.contains(newWord)){
						queue.add(new WordNode(newWord, top.numSteps+1));
						dict.remove(newWord);
					}
					arr[i] = temp;
				}
			}
		}
		return 0;
	}
	
}
