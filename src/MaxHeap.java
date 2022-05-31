
import java.util.*;

public class MaxHeap<K, V> {

List<HeapEntry<K,V>> entries;
int capacity;
int heapSize = 0;
Comparator comparator;

    public MaxHeap(int capacity, Comparator comparator){
        this.capacity = capacity;

        this.entries =  new ArrayList<HeapEntry<K, V>>(capacity);
        this.comparator = comparator;
        heapSize=0;
       
    }

	public void add(K key, V value){

	}

	
	public int parent(int i)
	{
	   
	}
	 
	
	public boolean isEmpty() {
	
	}
	
	public HeapEntry<K,V> peek() {
		    
	}
	
	public HeapEntry<K,V> remove() {
		
	}
	
	
	int left(int index){
		
	}
	
	int right(int index){
		
	}
	
}

class HeapEntry<K, V> implements DefaultMap.Entry<K,V>{
	K key;
	V value;

	HeapEntry(K key, V value){
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}

	public void setValue(V value){
		this.value = value;
	}
}
