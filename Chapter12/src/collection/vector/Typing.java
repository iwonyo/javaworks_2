package collection.vector;

import java.util.Scanner;
import java.util.Vector;

public class Typing {
	
	Vector words = new Vector();
	int interval = 3 * 1000;
	String[] data = {"bear", "cat", "dog", "eagle", "monkey", "tiger"};
	WordGenerator wg = new WordGenerator();
	
	public static void main(String[] args) {
		Typing typing = new Typing();
		typing.wg.start();
		
		Vector words = typing.words;
		System.out.println("준비되면 엔터");
		while(true) {
			System.out.println(words);
			String prompt = ">>";
			System.out.println(prompt);
			
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine().trim();
			int index = words.indexOf(input);
			
			if(index != -1) {
				words.remove(index);
			}
		}
	}
	
	class WordGenerator extends Thread{
		@Override
		public void run() {
			while(true) {
				int rand =(int)(Math.random()*data.length);
				words.add(data[rand]);
				try {
					Thread.sleep(interval);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
