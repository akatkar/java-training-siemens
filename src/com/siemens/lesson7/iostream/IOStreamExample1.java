package com.siemens.lesson7.iostream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IOStreamExample1 {
	public static void main(String[] args) throws IOException {
		String[] bookStore = { "Book1", "Book2", "Book3" };

		// File nesnesi yarat ve "file1.txt" dosyasını göster
		File file = new File("file1.txt");
		// Dosya yoksa yarat
		file.createNewFile();
		// Dosyaya yazmak için FileWriter nesnesi yarat
		FileWriter fr = new FileWriter(file);
		// Dosyaya satır satır yazabilmek için PrintWriter nesnesi yarat
		PrintWriter pw = new PrintWriter(fr);

		// Döngü içinde verileri dosyaya yaz
		for (String s : bookStore)
			pw.println(s);
		pw.close();
	}

}
