package com.solu.ps.print;

import java.util.HashSet;
import java.util.List;

public class PrintDocument {
	long priority;
	
	
	
	public static HashSet<Document> merge(List<Document> d1, List<Document> d2) {
		HashSet<Document> mergedDocs = new HashSet<Document>();
		
		d1.forEach(d->{mergedDocs.add(d);});
		d2.forEach(d->{mergedDocs.add(d);});
		
		return mergedDocs;
	}	

}
