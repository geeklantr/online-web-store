package com.unoopen.store;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Store {

	public static void main(String[] args) throws IOException {
		
		ItemReader consoleReader = new FileItemReader();
		
		List<Item> storeItems = consoleReader.read();

		for (Item item : storeItems) {
			System.out.println(item);
		}
	}
}
