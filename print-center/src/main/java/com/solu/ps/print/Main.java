package com.solu.ps.print;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//1,000,000
		
		List<Document> pd1 = new ArrayList<Document>();
		List<Document> pd2 = new ArrayList<Document>();

		String fileName="fileName-";
		for(int i=1;i<=5;i++){
			pd1.add(new Document(fileName+i+".pdf"));
		}
		for(int i=5;i<=10;i++){
			pd2.add(new Document(fileName+i+".xls"));
		}
		
		HashSet<Document> pd3 = new PrintDocument().merge(pd1, pd2);
		for(Document d: pd3 ){
			System.out.println(d.getFileName());
		}
	}

}
