package chapter.eleven;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class ElevenDotOne {
	
	public static List<Integer> mergeSortedArrays(List<List<Integer>> sortedArrays){
		
		PriorityQueue<ArrayEntry> minHeap = new PriorityQueue<>(16, new Comparator<ArrayEntry>(){
			@Override
			public int compare(ArrayEntry o1, ArrayEntry o2){
				return Integer.compare(o1.value, o2.value);
			}
		});
		
		List<Integer> indicies = new ArrayList<>(sortedArrays.size());
		
		for(int i = 0; i < sortedArrays.size(); i++){
			
			minHeap.add(new ArrayEntry(sortedArrays.get(i).get(0), i));
		}
		return null;
	}
//	~~~~~~~~~~~~~NOT COMPLETE : ) ~~~~~~~~~~~~~~~~~~~~
	
}