package com.siemens.lesson7.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionExample3 {
	private static final String POEM =  
	"Bin atlı akınlarda çocuklar gibi şendik\r\n" + 
	"Bin atlı o gün dev gibi bir orduyu yendik\r\n" + 
	"\r\n" + 
	"Haykırdı ak tolgalı beylerbeyi \"ilerle\"\r\n" + 
	"Bir yaz günü geçtik tunadan kafilelerle\r\n" + 
	"\r\n" + 
	"Şimşek gibi atıldık bir semte yedi koldan\r\n" + 
	"Şimşek gibi Türk atlarının geçtiği yoldan\r\n" + 
	"\r\n" + 
	"Bir gün yine doludizgin atlarımızla\r\n" + 
	"Yerden yedi kat arşa kanatlandık o hızla\r\n" + 
	"\r\n" + 
	"Cennette bu gün gülleri açmış görürüzde\r\n" + 
	"Hala o kızıl hatıra gitmez gözümüzde\r\n" + 
	"\r\n" + 
	"Bin atlı akınlarda çocuklar gibi şendik\r\n" + 
	"Bin atlı o gün dev gibi bir orduyu yendik";
	
	private static final String WORD_REGEXP = "[ \r\n]+";
	
	public static void main(String[] args) {
		System.out.println(POEM);
		
		// Kelime dizisini bul.
		String[] wordArray = POEM.split(WORD_REGEXP);
		
		// listeye kelimeleri ekle
		List<String> wordList = new ArrayList<>(wordArray.length);
		for(String word: wordArray) {
			word = word.trim();
			if(word == "") {
				continue;
			}
			System.out.println(word);
			wordList.add(word);
		}
		
		// Set collection'a bütün listeyi koy
		Set<String> wordSet = new HashSet<>();
		wordSet.addAll(wordList);
		System.out.println("Kullanılan Farklı Kelime sayısı:" + wordSet.size());
		System.out.println();
		System.out.println("Kelimelerin sayıları");
		System.out.println("--------------------");
		HashMap<String, Integer> wordMap = new HashMap<>();
		for(String word:wordList) {
			if(wordMap.containsKey(word)) {
				int value = wordMap.get(word);
				wordMap.put(word, value + 1);
			}else {
				wordMap.put(word, 1);
			}
		}
		
		// Kelimeleri sayılarıyla bas
		for(String key:wordMap.keySet()) {
			System.out.println(key + ":" + wordMap.get(key));
		}
		
		System.out.println("Kelimelerin sayıları");
		System.out.println("--------------------");
		
		List<String> sortedList = new ArrayList<>();
		for(String key:wordMap.keySet()) {
			sortedList.add(key + " : " + wordMap.get(key));
		}
		
		// Case Sensitive sıralama
		sortedList.sort((x,y)->x.compareTo(y));
		
		sortedList.forEach(System.out::println);
		System.out.println("--------------------");
		// Case Insensitive sıralama
		
		sortedList.sort((x,y)->x.toLowerCase().compareTo(y.toLowerCase()));
		sortedList.forEach(System.out::println);
		
		System.out.println("--------------------");
		
		// En çok kullanılan kelimeye göre sıralama
		
//		sortedList.sort((x,y)-> wordMap.get(x.split(":")[0].trim()).compareTo(wordMap.get(y.split(":")[0].trim())));
		sortedList.sort((x,y)->x.split(":")[1].trim().compareTo(y.split(":")[1].trim()));
		sortedList.forEach(System.out::println);
		
		System.out.println("--------------------");
		
		sortedList.sort((x, y)->y.split(":")[1].trim().compareTo(x.split(":")[1].trim()));
		sortedList.forEach(System.out::println);
		
		System.out.println("--------------------");
		
		// En uzundan en kısaya sıralama
		sortedList.sort((x, y)->x.split(":")[0].length() - y.split(":")[0].length());
		sortedList.forEach(System.out::println);
		
		System.out.println("--------------------");
	}
}
