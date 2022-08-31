package mainpackage;

import java.util.Arrays;
import java.util.HashMap;

public class PrimaryClass {

	public static void main(String[] args) throws Throwable {
//		messWithClassScopes();

		MyMap hashMap = new MyMap();
		
		hashMap.addItem("Name", "Yobra");
		hashMap.addItem("movie_star", "Trejo");
		hashMap.addItem("Piper");
		hashMap.addItem("player", 34);
		hashMap.addItem("noValueUszed");
		
		hashMap.addItem(new String(new char[] {(char)104, (char)105, (char)103}), "charCast_like_in_C");

		System.out.println("\nRecord with name : " + hashMap.getValue("Name"));
		System.out.println("\nObject Size: " + hashMap.getSize());
//		hashMap.pop();
		System.out.println("\nObject Size after pop: " + hashMap.getSize());
		
		// Show key:value pair
		System.out.println("\n// Show key:value pair\n"+hashMap.getPair("movie_star"));
		
		// Show all pairs
		System.out.println("\n// Show all pairs:\n"+hashMap.getAllPairs());
	}

	static void messWithClassScopes() {
		System.out.println("\n_AbstractClass_\n");

		System.out.println("Before init Hash" + AbstractClass.getHash());
		AbstractClass.setHash(10001);
		System.out.println("After set Hash" + AbstractClass.getHash());

		System.out.println("\n_AnotherClass_\n");

		System.out.println("Before init Hash: " + AnotherClass.getHash());
		AnotherClass.setHash(20001);
		System.out.println("After set Hash: " + AnotherClass.getHash());
	}
}
