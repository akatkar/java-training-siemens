package com.siemens.lesson7.iostream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IOStreamExample2 {
	
	public static void main(String[] args) {
		String[] bookStore = { "Book1", "Book2", "Book3", "Book4" };

		// File nesnesi yarat ve "file1.txt" dosyasını göster
		File file = new File("file1.txt");
		try {
			// Dosya yoksa yarat
			file.createNewFile();

			// Dosyaya satır satır yazabilmek için PrintWriter nesnesi yarat
			try (PrintWriter pw = new PrintWriter(new FileWriter(file))) {

				// Döngü içinde verileri dosyaya yaz
				for (String s : bookStore)
					pw.println(s);
			}

		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
