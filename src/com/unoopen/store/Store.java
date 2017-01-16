package com.unoopen.store;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Store {

	public static void main(String[] args) throws IOException {
		// TODO Read items from a MySQL database
		// Create a new reader called DatabaseItemReader to replace FileItemReader below
		// Use MySQL table which has item id, name, description, price
		ItemReader itemReader = new FileItemReader();
		
		List<Item> storeItems = itemReader.read();

		for (Item item : storeItems) {
			System.out.println(item);
		}
	}
}
