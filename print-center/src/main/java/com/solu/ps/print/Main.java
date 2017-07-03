package com.solu.ps.print;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//1,000,000
		
		List<Document> pd1 = new ArrayList<Document>();
		List<Document> pd2 = new ArrayList<Document>();

		String fileName="fileName-";
		for(int i=1;i<=500000;i++){
			pd1.add(new Document(fileName+i+".pdf"));
		}
		for(int i=500000;i<=1000000;i++){
			pd2.add(new Document(fileName+i+".xls"));
		}
		
		LocalDateTime startTime = LocalDateTime.now();
		HashSet<Document> pd3 = new PrintDocument().merge(pd1, pd2);
		LocalDateTime endTime = LocalDateTime.now();
		
		System.out.println("STARTED AT : "+startTime.getMinute()+":"+startTime.getSecond());
		System.out.println("ENDED   AT : "+endTime.getMinute()+":"+endTime.getSecond());
		System.out.println("Total Time Consumed ="+(endTime.getMinute() - startTime.getMinute())+":"+(endTime.getSecond() - startTime.getSecond()));
		
		/*for(Document d: pd3 ){
			System.out.println(d.getFileName());
		}*/
	}

}
