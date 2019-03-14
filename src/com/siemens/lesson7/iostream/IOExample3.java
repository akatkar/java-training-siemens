package com.siemens.lesson7.iostream;

import java.io.*;

public class IOExample3 {
	public static void main(String[] args) {
		String s = "";
		try {
			// File nesnesi yarat ve "file1.txt" dosyasını göster
			File file = new File("file1.txt");
			// file nesnesinden veri okumak için FileReader nesnesi yarat
			// Veriyi tampon bellek üzerinden işleyebilmek için
			// BufferReader nesnesi yarat
			try (BufferedReader bf = new BufferedReader(new FileReader(file))) {

				// Döngü içersinde veriyi oku ve ekrana bas
				while ((s = bf.readLine()) != null) {
					System.out.println(s);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
