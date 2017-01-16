package com.unoopen.store;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileItemReader implements ItemReader {

	private static final String FILENAME = "items.txt";

	@Override
	public List<Item> read() {
		List<Item> list = new ArrayList<Item>();
		try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
			String strLine;

			br.readLine();

			while ((strLine = br.readLine()) != null) {
				String[] arr = strLine.split("\\s+"); // Breaking each line into
														// array of words
				Item item = new Item(arr[0], arr[1], Integer.parseInt(arr[2]));
				list.add(item);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
